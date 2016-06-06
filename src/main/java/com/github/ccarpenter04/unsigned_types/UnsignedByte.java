package com.github.ccarpenter04.unsigned_types;

import java.math.BigInteger;

public class UnsignedByte extends UnsignedNumber<UnsignedByte> {
    public static final short MIN_VALUE = 0x00;
    public static final short MAX_VALUE = 0xFF;
    private final byte signed;

    public UnsignedByte(byte signed) {
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
    public short shortValue() {
        return (short) (signed & MAX_VALUE);
    }

    @Override
    public int compareTo(UnsignedByte o) {
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
