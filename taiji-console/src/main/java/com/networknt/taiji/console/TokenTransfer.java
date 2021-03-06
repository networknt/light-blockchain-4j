package com.networknt.taiji.console;

import com.networknt.chain.utility.Console;
import com.networknt.config.JsonMapper;
import com.networknt.kafka.common.AvroSerializer;
import com.networknt.monad.Result;
import com.networknt.status.Status;
import com.networknt.taiji.client.TaijiClient;
import com.networknt.taiji.crypto.*;
import com.networknt.taiji.event.EventId;
import com.networknt.taiji.token.TokenTransferredEvent;
import com.networknt.taiji.utility.Converter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.networknt.chain.utility.Console.exitError;

public class TokenTransfer extends TokenManager {
    public TokenTransfer() {
    }

    public TokenTransfer(IODevice console) {
        super(console);
    }

    public static void main(String[] args) {
        new TokenTransfer().run();
    }

    static void main(IODevice console) {
        new TokenTransfer(console).run();
    }

    private void run() {
        String currency = getCurrency();
        String ownerAddress = getOwnerAddress();
        Credentials credentials = loadWalletFromAddress(ownerAddress);
        console.printf("Wallet for address " + credentials.getAddress() + " loaded\n");
        String tokenAddress = getTokenAddress();
        String transferredAddress = getTransferredAddress();
        Long l = getTransferredAmount();
        String comment = getComment();

        Result<Map<String, Object>> tokenInfoResult = TaijiClient.getTokenInfoByAddress(tokenAddress);
        Map<String, Object> tokenInfo = null;
        if(tokenInfoResult.isSuccess()) {
            tokenInfo = tokenInfoResult.getResult();
        } else {
            exitError(tokenInfoResult.getError().toString());
        }
        int decimals = (Integer)tokenInfo.get("decimals");
        long factor = Converter.power(10, decimals);
        long total = l * factor;
        String symbol = (String)tokenInfo.get("symbol");

        // get number of transactions from the chain-reader to generate eventId.
        long nonce = 0;
        Result<String> result = TaijiClient.getTransaction(ownerAddress, currency, 0, 1); // get the last transaction
        if(result.isSuccess()) {
            List<Map<String, Object>> txs = JsonMapper.string2List(result.getResult());
            nonce = (Long)txs.get(0).get("no") + 1;
        } else {
            exitError(result.getError().toString());
        }
        EventId eventId = EventId.newBuilder()
                .setAddress(ownerAddress)
                .setNonce(nonce)
                .build();
        Map<String, Object> valueMap = new HashMap<>();
        if(comment != null) valueMap.put("comment", comment);

        TokenTransferredEvent tokenTransferredEvent = TokenTransferredEvent.newBuilder()
                .setEventId(eventId)
                .setSymbol(symbol)
                .setToAddress(transferredAddress)
                .setAmount(total)
                .setValue(JsonMapper.toJson(valueMap))
                .setTimestamp(System.currentTimeMillis())
                .build();

        AvroSerializer serializer = new AvroSerializer();
        byte[] bytes = serializer.serialize(tokenTransferredEvent);

        // here we just create a credit entry only on with the toAddress the token address and value 0
        LedgerEntry creditEntry = new LedgerEntry(tokenAddress, 0, bytes);
        RawTransaction rtx = new RawTransaction(currency);
        rtx.addCreditEntry(tokenAddress, creditEntry);
        // calculate the fee for the debit entry
        Result<Fee> feeResult = TaijiClient.getFee(ownerAddress, currency);
        Fee fee = null;
        if(feeResult.isSuccess()) {
            fee = feeResult.getResult();
        } else {
            exitError(feeResult.getError().toString());
        }
        LedgerEntry feeEntry = new LedgerEntry(fee.getBankAddress(), fee.getApplication());
        rtx.addCreditEntry(fee.getBankAddress(), feeEntry);
        rtx.addDebitEntry(ownerAddress, feeEntry);
        SignedTransaction stx = TransactionManager.signTransaction(rtx, credentials);

        Status status = TaijiClient.postTx(credentials.getAddress().substring(0, 4), stx);
        if(status != null && status.getStatusCode() == 200) {
            Console.exitSuccess((String.format("Token has been transferred successfully for owner address %s, token address %s to transferred address %s with status %s%n",
                    ownerAddress,
                    tokenAddress,
                    transferredAddress,
                    status.toString())));
        } else {
            if(status == null) {
                Console.exitError("Nothing returned from the API call, check connectivity");
            } else {
                Console.exitError(status.toString());
            }
        }
    }
}
