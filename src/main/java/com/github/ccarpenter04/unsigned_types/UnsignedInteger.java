package com.github.ccarpenter04.unsigned_types;

import java.math.BigInteger;

public class UnsignedInteger extends UnsignedNumber<UnsignedInteger> {
    public static final long MIN_VALUE = 0x00000000;
    public static final long MAX_VALUE = 0xFFFFFFFFL;
    private final int signed;

    public UnsignedInteger(int signed) {
        this.signed = signed;
    }

    @Override
    public int intValue() {
        return (int) longValue();
    }

    @Override
    public long longValue() {
        return signed & MAX_VALUE;
    }

    @Override
    public float floatValue() {
        return longValue();
    }

    @Override
    public double doubleValue() {
        return longValue();
    }

    @Override
    public int compareTo(UnsignedInteger o) {
        return Long.compare(signed & MAX_VALUE, o.signed & MAX_VALUE);
    }

    @Override
    public String toString() {
        return Long.toString(signed & MAX_VALUE);
    }

    @Override
    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(signed & MAX_VALUE);
    }
}
