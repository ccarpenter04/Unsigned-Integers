package com.github.ccarpenter04.unsigned_types;

import java.math.BigInteger;

public class UnsignedLong extends UnsignedNumber<UnsignedLong> {
    public static final BigInteger MIN_VALUE = BigInteger.ZERO;
    public static final BigInteger MAX_VALUE = new BigInteger("18446744073709551615");
    private static final BigInteger MAX_SIGNED_VALUE = new BigInteger("9223372036854775808");
    private final BigInteger unsigned;

    public UnsignedLong(long signed) {
        if (signed >= 0) {
            this.unsigned = BigInteger.valueOf(signed);
        } else {
            this.unsigned = BigInteger.valueOf(signed & Long.MAX_VALUE).add(MAX_SIGNED_VALUE);
        }
    }

    @Override
    public int intValue() {
        return unsigned.intValue();
    }

    @Override
    public long longValue() {
        return unsigned.longValue();
    }

    @Override
    public float floatValue() {
        return unsigned.floatValue();
    }

    @Override
    public double doubleValue() {
        return unsigned.doubleValue();
    }

    @Override
    public int compareTo(UnsignedLong o) {
        return unsigned.compareTo(o.unsigned);
    }

    @Override
    public String toString() {
        return unsigned.toString();
    }

    @Override
    public BigInteger bigIntegerValue() {
        return unsigned;
    }
}
