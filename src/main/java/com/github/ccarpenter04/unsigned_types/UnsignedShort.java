package com.github.ccarpenter04.unsigned_types;

import java.math.BigInteger;
import java.util.Objects;

/**
 * UnsignedShort
 * <p>
 * A class representing an unsigned short.
 * <p>
 * Java has no primitive support for unsigned datatypes, therefore masking and casting to higher level primitives are
 * required to perform basic arithmetic.
 *
 * @author Christopher Carpenter
 * @author Ian Caffey
 * @since 1.0.0
 */
public class UnsignedShort extends UnsignedNumber<UnsignedShort> {
    public static final int MIN_VALUE = 0x0000;
    public static final int MAX_VALUE = 0xFFFF;
    private final short signed;

    /**
     * Constructs a new {@code UnsignedShort} using a signed primitive value.
     *
     * @param signed the signed primitive value to represent as unsigned
     */
    public UnsignedShort(short signed) {
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
        return o instanceof UnsignedShort && Objects.equals(signed, ((UnsignedShort) o).signed);
    }

    @Override
    public String toString() {
        return Integer.toString(signed & MAX_VALUE);
    }

    @Override
    public int compareTo(UnsignedShort o) {
        return Integer.compare(signed & MAX_VALUE, o.signed & MAX_VALUE);
    }
}
