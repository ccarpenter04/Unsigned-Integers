package com.github.ccarpenter04.unsigned_types;

import java.math.BigInteger;

/**
 * UnsignedInteger
 * <p>
 * A class representing an unsigned integer.
 * <p>
 * Java has no primitive support for unsigned datatypes, therefore masking and casting to higher level primitives are
 * required to perform basic arithmetic.
 *
 * @author Christopher Carpenter
 * @author Ian Caffey
 * @since 1.0.0
 */
public class UnsignedInteger extends UnsignedNumber<UnsignedInteger> {
    public static final long MIN_VALUE = 0x00000000;
    public static final long MAX_VALUE = 0xFFFFFFFFL;
    private final int signed;

    /**
     * Constructs a new {@code UnsignedInteger} using a signed primitive value.
     *
     * @param signed the signed primitive value to represent as unsigned
     */
    public UnsignedInteger(int signed) {
        this.signed = signed;
    }

    /**
     * Returns this unsigned number as an {@code int}.
     *
     * @return the unsigned numeric value represented as {@code int}.
     */
    @Override
    public int intValue() {
        return (int) longValue();
    }

    /**
     * Returns this unsigned number as a {@code long}.
     *
     * @return the unsigned numeric value represented as {@code long}.
     */
    @Override
    public long longValue() {
        return signed & MAX_VALUE;
    }

    /**
     * Returns this unsigned number as a {@code float}.
     *
     * @return the unsigned numeric value represented as {@code float}.
     */
    @Override
    public float floatValue() {
        return longValue();
    }

    /**
     * Returns this unsigned number as a {@code double}.
     *
     * @return the unsigned numeric value represented as {@code double}.
     */
    @Override
    public double doubleValue() {
        return longValue();
    }

    /**
     * Returns this unsigned number as a {@code BigInteger}.
     *
     * @return the unsigned numeric value represented as {@code BigInteger}.
     */
    @Override
    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(signed & MAX_VALUE);
    }

    /**
     * A faster hashCode implementation than the base {code UnsignedNumber}
     */
    @Override
    public int hashCode() {
        return signed;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof UnsignedInteger && signed == ((UnsignedInteger) o).signed;
    }

    @Override
    public String toString() {
        return Long.toString(signed & MAX_VALUE);
    }

    @Override
    public int compareTo(UnsignedInteger o) {
        return Long.compare(signed & MAX_VALUE, o.signed & MAX_VALUE);
    }
}
