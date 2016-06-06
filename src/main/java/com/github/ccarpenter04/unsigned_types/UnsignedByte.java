package com.github.ccarpenter04.unsigned_types;

import java.math.BigInteger;

/**
 * UnsignedByte
 * <p>
 * A class representing an unsigned byte.
 * <p>
 * Java has no primitive support for unsigned datatypes, therefore masking and casting to higher level primitives are
 * required to perform basic arithmetic.
 *
 * @author Chris Carpenter
 * @author Ian Caffey
 * @since 1.0
 */
public class UnsignedByte extends UnsignedNumber<UnsignedByte> {
    public static final short MIN_VALUE = 0x00;
    public static final short MAX_VALUE = 0xFF;
    private final byte signed;

    /**
     * Constructs a new {@code UnsignedByte} using a signed primitive value.
     *
     * @param signed the signed primitive value to represent as unsigned
     */
    public UnsignedByte(byte signed) {
        this.signed = signed;
    }

    /**
     * Returns this unsigned number as an {@code int}.
     *
     * @return the unsigned numeric value represented as {@code int}.
     */
    @Override
    public int intValue() {
        return signed & MAX_VALUE;
    }

    /**
     * Returns this unsigned number as a {@code long}.
     *
     * @return the unsigned numeric value represented as {@code long}.
     */
    @Override
    public long longValue() {
        return intValue();
    }

    /**
     * Returns this unsigned number as a {@code float}.
     *
     * @return the unsigned numeric value represented as {@code float}.
     */
    @Override
    public float floatValue() {
        return intValue();
    }

    /**
     * Returns this unsigned number as a {@code double}.
     *
     * @return the unsigned numeric value represented as {@code double}.
     */
    @Override
    public double doubleValue() {
        return intValue();
    }

    /**
     * Returns this unsigned number as a {@code short}.
     *
     * @return the unsigned numeric value represented as {@code short}.
     */
    @Override
    public short shortValue() {
        return (short) (signed & MAX_VALUE);
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

    @Override
    public int compareTo(UnsignedByte o) {
        return Integer.compare(signed & MAX_VALUE, o.signed & MAX_VALUE);
    }

    @Override
    public int hashCode() {
        return Byte.hashCode(signed);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof UnsignedByte && signed == ((UnsignedByte) o).signed;
    }

    @Override
    public String toString() {
        return Integer.toString(signed & MAX_VALUE);
    }
}
