package com.github.ccarpenter04.unsigned_types;

import java.math.BigInteger;

public class UnsignedShort extends UnsignedNumber<UnsignedShort> {
    public static final int MIN_VALUE = 0x0000;
    public static final int MAX_VALUE = 0xFFFF;
    private final short signed;

    public UnsignedShort(short signed) {
        this.signed = signed;
    }

    @Override
    public int intValue() {
        return signed & MAX_VALUE;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return intValue();
    }

    @Override
    public double doubleValue() {
        return intValue();
    }

    @Override
    public int compareTo(UnsignedShort o) {
        return Integer.compare(signed & MAX_VALUE, o.signed & MAX_VALUE);
    }

    @Override
    public String toString() {
        return Integer.toString(signed & MAX_VALUE);
    }

    @Override
    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(signed & MAX_VALUE);
    }
}
