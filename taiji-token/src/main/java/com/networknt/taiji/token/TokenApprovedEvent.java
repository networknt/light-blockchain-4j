/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.networknt.taiji.token;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TokenApprovedEvent extends org.apache.avro.specific.SpecificRecordBase implements TokenEvent {
  private static final long serialVersionUID = -5093311199290380148L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TokenApprovedEvent\",\"namespace\":\"com.networknt.taiji.token\",\"fields\":[{\"name\":\"EventId\",\"type\":{\"type\":\"record\",\"name\":\"EventId\",\"namespace\":\"com.networknt.taiji.event\",\"fields\":[{\"name\":\"address\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"nonce\",\"type\":\"long\"},{\"name\":\"derived\",\"type\":\"boolean\",\"doc\":\"indicate if the event is derived from event processor\",\"default\":false}]}},{\"name\":\"symbol\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"toAddress\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"amount\",\"type\":\"long\"},{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"additional information in a JSON string, comment, etc\"},{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"time the event is recorded on the blockchain\",\"default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TokenApprovedEvent> ENCODER =
      new BinaryMessageEncoder<TokenApprovedEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TokenApprovedEvent> DECODER =
      new BinaryMessageDecoder<TokenApprovedEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TokenApprovedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TokenApprovedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TokenApprovedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TokenApprovedEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TokenApprovedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TokenApprovedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TokenApprovedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TokenApprovedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private com.networknt.taiji.event.EventId EventId;
   private java.lang.String symbol;
   private java.lang.String toAddress;
   private long amount;
  /** additional information in a JSON string, comment, etc */
   private java.lang.String value;
  /** time the event is recorded on the blockchain */
   private long timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TokenApprovedEvent() {}

  /**
   * All-args constructor.
   * @param EventId The new value for EventId
   * @param symbol The new value for symbol
   * @param toAddress The new value for toAddress
   * @param amount The new value for amount
   * @param value additional information in a JSON string, comment, etc
   * @param timestamp time the event is recorded on the blockchain
   */
  public TokenApprovedEvent(com.networknt.taiji.event.EventId EventId, java.lang.String symbol, java.lang.String toAddress, java.lang.Long amount, java.lang.String value, java.lang.Long timestamp) {
    this.EventId = EventId;
    this.symbol = symbol;
    this.toAddress = toAddress;
    this.amount = amount;
    this.value = value;
    this.timestamp = timestamp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return EventId;
    case 1: return symbol;
    case 2: return toAddress;
    case 3: return amount;
    case 4: return value;
    case 5: return timestamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: EventId = (com.networknt.taiji.event.EventId)value$; break;
    case 1: symbol = value$ != null ? value$.toString() : null; break;
    case 2: toAddress = value$ != null ? value$.toString() : null; break;
    case 3: amount = (java.lang.Long)value$; break;
    case 4: value = value$ != null ? value$.toString() : null; break;
    case 5: timestamp = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'EventId' field.
   * @return The value of the 'EventId' field.
   */
  public com.networknt.taiji.event.EventId getEventId() {
    return EventId;
  }


  /**
   * Sets the value of the 'EventId' field.
   * @param value the value to set.
   */
  public void setEventId(com.networknt.taiji.event.EventId value) {
    this.EventId = value;
  }

  /**
   * Gets the value of the 'symbol' field.
   * @return The value of the 'symbol' field.
   */
  public java.lang.String getSymbol() {
    return symbol;
  }


  /**
   * Sets the value of the 'symbol' field.
   * @param value the value to set.
   */
  public void setSymbol(java.lang.String value) {
    this.symbol = value;
  }

  /**
   * Gets the value of the 'toAddress' field.
   * @return The value of the 'toAddress' field.
   */
  public java.lang.String getToAddress() {
    return toAddress;
  }


  /**
   * Sets the value of the 'toAddress' field.
   * @param value the value to set.
   */
  public void setToAddress(java.lang.String value) {
    this.toAddress = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public long getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(long value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return additional information in a JSON string, comment, etc
   */
  public java.lang.String getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * additional information in a JSON string, comment, etc
   * @param value the value to set.
   */
  public void setValue(java.lang.String value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return time the event is recorded on the blockchain
   */
  public long getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * time the event is recorded on the blockchain
   * @param value the value to set.
   */
  public void setTimestamp(long value) {
    this.timestamp = value;
  }

  /**
   * Creates a new TokenApprovedEvent RecordBuilder.
   * @return A new TokenApprovedEvent RecordBuilder
   */
  public static com.networknt.taiji.token.TokenApprovedEvent.Builder newBuilder() {
    return new com.networknt.taiji.token.TokenApprovedEvent.Builder();
  }

  /**
   * Creates a new TokenApprovedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TokenApprovedEvent RecordBuilder
   */
  public static com.networknt.taiji.token.TokenApprovedEvent.Builder newBuilder(com.networknt.taiji.token.TokenApprovedEvent.Builder other) {
    if (other == null) {
      return new com.networknt.taiji.token.TokenApprovedEvent.Builder();
    } else {
      return new com.networknt.taiji.token.TokenApprovedEvent.Builder(other);
    }
  }

  /**
   * Creates a new TokenApprovedEvent RecordBuilder by copying an existing TokenApprovedEvent instance.
   * @param other The existing instance to copy.
   * @return A new TokenApprovedEvent RecordBuilder
   */
  public static com.networknt.taiji.token.TokenApprovedEvent.Builder newBuilder(com.networknt.taiji.token.TokenApprovedEvent other) {
    if (other == null) {
      return new com.networknt.taiji.token.TokenApprovedEvent.Builder();
    } else {
      return new com.networknt.taiji.token.TokenApprovedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for TokenApprovedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TokenApprovedEvent>
    implements org.apache.avro.data.RecordBuilder<TokenApprovedEvent> {

    private com.networknt.taiji.event.EventId EventId;
    private com.networknt.taiji.event.EventId.Builder EventIdBuilder;
    private java.lang.String symbol;
    private java.lang.String toAddress;
    private long amount;
    /** additional information in a JSON string, comment, etc */
    private java.lang.String value;
    /** time the event is recorded on the blockchain */
    private long timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.networknt.taiji.token.TokenApprovedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.EventId)) {
        this.EventId = data().deepCopy(fields()[0].schema(), other.EventId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasEventIdBuilder()) {
        this.EventIdBuilder = com.networknt.taiji.event.EventId.newBuilder(other.getEventIdBuilder());
      }
      if (isValidValue(fields()[1], other.symbol)) {
        this.symbol = data().deepCopy(fields()[1].schema(), other.symbol);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.toAddress)) {
        this.toAddress = data().deepCopy(fields()[2].schema(), other.toAddress);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.amount)) {
        this.amount = data().deepCopy(fields()[3].schema(), other.amount);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.value)) {
        this.value = data().deepCopy(fields()[4].schema(), other.value);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[5].schema(), other.timestamp);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing TokenApprovedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.networknt.taiji.token.TokenApprovedEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.EventId)) {
        this.EventId = data().deepCopy(fields()[0].schema(), other.EventId);
        fieldSetFlags()[0] = true;
      }
      this.EventIdBuilder = null;
      if (isValidValue(fields()[1], other.symbol)) {
        this.symbol = data().deepCopy(fields()[1].schema(), other.symbol);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.toAddress)) {
        this.toAddress = data().deepCopy(fields()[2].schema(), other.toAddress);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.amount)) {
        this.amount = data().deepCopy(fields()[3].schema(), other.amount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.value)) {
        this.value = data().deepCopy(fields()[4].schema(), other.value);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[5].schema(), other.timestamp);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'EventId' field.
      * @return The value.
      */
    public com.networknt.taiji.event.EventId getEventId() {
      return EventId;
    }


    /**
      * Sets the value of the 'EventId' field.
      * @param value The value of 'EventId'.
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder setEventId(com.networknt.taiji.event.EventId value) {
      validate(fields()[0], value);
      this.EventIdBuilder = null;
      this.EventId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'EventId' field has been set.
      * @return True if the 'EventId' field has been set, false otherwise.
      */
    public boolean hasEventId() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'EventId' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.networknt.taiji.event.EventId.Builder getEventIdBuilder() {
      if (EventIdBuilder == null) {
        if (hasEventId()) {
          setEventIdBuilder(com.networknt.taiji.event.EventId.newBuilder(EventId));
        } else {
          setEventIdBuilder(com.networknt.taiji.event.EventId.newBuilder());
        }
      }
      return EventIdBuilder;
    }

    /**
     * Sets the Builder instance for the 'EventId' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder setEventIdBuilder(com.networknt.taiji.event.EventId.Builder value) {
      clearEventId();
      EventIdBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'EventId' field has an active Builder instance
     * @return True if the 'EventId' field has an active Builder instance
     */
    public boolean hasEventIdBuilder() {
      return EventIdBuilder != null;
    }

    /**
      * Clears the value of the 'EventId' field.
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder clearEventId() {
      EventId = null;
      EventIdBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'symbol' field.
      * @return The value.
      */
    public java.lang.String getSymbol() {
      return symbol;
    }


    /**
      * Sets the value of the 'symbol' field.
      * @param value The value of 'symbol'.
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder setSymbol(java.lang.String value) {
      validate(fields()[1], value);
      this.symbol = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'symbol' field has been set.
      * @return True if the 'symbol' field has been set, false otherwise.
      */
    public boolean hasSymbol() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'symbol' field.
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder clearSymbol() {
      symbol = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'toAddress' field.
      * @return The value.
      */
    public java.lang.String getToAddress() {
      return toAddress;
    }


    /**
      * Sets the value of the 'toAddress' field.
      * @param value The value of 'toAddress'.
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder setToAddress(java.lang.String value) {
      validate(fields()[2], value);
      this.toAddress = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'toAddress' field has been set.
      * @return True if the 'toAddress' field has been set, false otherwise.
      */
    public boolean hasToAddress() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'toAddress' field.
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder clearToAddress() {
      toAddress = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public long getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder setAmount(long value) {
      validate(fields()[3], value);
      this.amount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder clearAmount() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * additional information in a JSON string, comment, etc
      * @return The value.
      */
    public java.lang.String getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * additional information in a JSON string, comment, etc
      * @param value The value of 'value'.
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder setValue(java.lang.String value) {
      validate(fields()[4], value);
      this.value = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * additional information in a JSON string, comment, etc
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'value' field.
      * additional information in a JSON string, comment, etc
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder clearValue() {
      value = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * time the event is recorded on the blockchain
      * @return The value.
      */
    public long getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * time the event is recorded on the blockchain
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder setTimestamp(long value) {
      validate(fields()[5], value);
      this.timestamp = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * time the event is recorded on the blockchain
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * time the event is recorded on the blockchain
      * @return This builder.
      */
    public com.networknt.taiji.token.TokenApprovedEvent.Builder clearTimestamp() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TokenApprovedEvent build() {
      try {
        TokenApprovedEvent record = new TokenApprovedEvent();
        if (EventIdBuilder != null) {
          try {
            record.EventId = this.EventIdBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("EventId"));
            throw e;
          }
        } else {
          record.EventId = fieldSetFlags()[0] ? this.EventId : (com.networknt.taiji.event.EventId) defaultValue(fields()[0]);
        }
        record.symbol = fieldSetFlags()[1] ? this.symbol : (java.lang.String) defaultValue(fields()[1]);
        record.toAddress = fieldSetFlags()[2] ? this.toAddress : (java.lang.String) defaultValue(fields()[2]);
        record.amount = fieldSetFlags()[3] ? this.amount : (java.lang.Long) defaultValue(fields()[3]);
        record.value = fieldSetFlags()[4] ? this.value : (java.lang.String) defaultValue(fields()[4]);
        record.timestamp = fieldSetFlags()[5] ? this.timestamp : (java.lang.Long) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TokenApprovedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<TokenApprovedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TokenApprovedEvent>
    READER$ = (org.apache.avro.io.DatumReader<TokenApprovedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.EventId.customEncode(out);

    out.writeString(this.symbol);

    out.writeString(this.toAddress);

    out.writeLong(this.amount);

    out.writeString(this.value);

    out.writeLong(this.timestamp);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.EventId == null) {
        this.EventId = new com.networknt.taiji.event.EventId();
      }
      this.EventId.customDecode(in);

      this.symbol = in.readString();

      this.toAddress = in.readString();

      this.amount = in.readLong();

      this.value = in.readString();

      this.timestamp = in.readLong();

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.EventId == null) {
            this.EventId = new com.networknt.taiji.event.EventId();
          }
          this.EventId.customDecode(in);
          break;

        case 1:
          this.symbol = in.readString();
          break;

        case 2:
          this.toAddress = in.readString();
          break;

        case 3:
          this.amount = in.readLong();
          break;

        case 4:
          this.value = in.readString();
          break;

        case 5:
          this.timestamp = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










