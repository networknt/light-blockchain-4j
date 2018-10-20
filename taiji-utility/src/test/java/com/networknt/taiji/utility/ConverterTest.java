package com.networknt.taiji.utility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConverterTest {
    static final Long maxLongValue = Long.MAX_VALUE;
    static final String maxLongString = "9223372036854775807";

    @Test
    public void testFromShell() {
        assertThat(Converter.fromShell(maxLongString, Converter.Unit.SHELL),
                is(new Long("9223372036854775807")));
        assertThat(Converter.fromShell(maxLongString, Converter.Unit.KSHELL),
                is(new Long("9223372036854775")));
        assertThat(Converter.fromShell(maxLongString, Converter.Unit.MSHELL),
                is(new Long("9223372036854")));
        assertThat(Converter.fromShell(maxLongString, Converter.Unit.TAIJI),
                is(new Long("92233720368")));
        assertThat(Converter.fromShell(maxLongString, Converter.Unit.KTAIJI),
                is(new Long("92233720")));
        assertThat(Converter.fromShell(maxLongString, Converter.Unit.MTAIJI),
                is(new Long("92233")));

        assertThat(Converter.fromShell(maxLongValue, Converter.Unit.SHELL),
                is(new Long("9223372036854775807")));
        assertThat(Converter.fromShell(maxLongValue, Converter.Unit.KSHELL),
                is(new Long("9223372036854775")));
        assertThat(Converter.fromShell(maxLongValue, Converter.Unit.MSHELL),
                is(new Long("9223372036854")));
        assertThat(Converter.fromShell(maxLongValue, Converter.Unit.TAIJI),
                is(new Long("92233720368")));
        assertThat(Converter.fromShell(maxLongValue, Converter.Unit.KTAIJI),
                is(new Long("92233720")));
        assertThat(Converter.fromShell(maxLongValue, Converter.Unit.MTAIJI),
                is(new Long("92233")));
    }

    @Test
    public void testToShell() {
        assertThat(Converter.toShell("21", Converter.Unit.SHELL), is(new Long("21")));
        assertThat(Converter.toShell("21", Converter.Unit.KSHELL), is(new Long("21000")));
        assertThat(Converter.toShell("21", Converter.Unit.MSHELL), is(new Long("21000000")));
        assertThat(Converter.toShell("21", Converter.Unit.TAIJI),
                is(new Long("2100000000")));
        assertThat(Converter.toShell("21", Converter.Unit.KTAIJI),
                is(new Long("2100000000000")));
        assertThat(Converter.toShell("21", Converter.Unit.MTAIJI),
                is(new Long("2100000000000000")));
    }

    @Test
    public void testUnit() {
        assertThat(Converter.Unit.fromString("taiji"), is(Converter.Unit.TAIJI));
        assertThat(Converter.Unit.fromString("TAIJI"), is(Converter.Unit.TAIJI));
        assertThat(Converter.Unit.fromString("Shell"), is(Converter.Unit.SHELL));
    }
    
}
