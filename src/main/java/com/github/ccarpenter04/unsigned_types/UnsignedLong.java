package com.github.ccarpenter04.unsigned_types;

import java.math.BigInteger;
import java.util.Objects;

/**
 * UnsignedLong
 * <p>
 * A class representing an unsigned long.
 * <p>
 * Java has no primitive support for unsigned datatypes, therefore masking and casting to higher level primitives are
 * required to perform basic arithmetic.
 *
 * @author Christopher Carpenter
 * @author Ian Caffey
 * @since 1.0.0
 */
public class UnsignedLong extends UnsignedNumber<UnsignedLong> {
    public static final BigInteger MIN_VALUE = BigInteger.ZERO;
    public static final BigInteger MAX_VALUE = new BigInteger("18446744073709551615");
    private static final BigInteger MAX_SIGNED_VALUE = new BigInteger("9223372036854775808");
    private final BigInteger unsigned;

    /**
     * Constructs a new {@code UnsignedLong} using a signed primitive value.
     *
     * @param signed the signed primitive value to represent as unsigned
     */
    public UnsignedLong(long signed) {
        if (signed >= 0) {
            this.unsigned = BigInteger.valueOf(signed);
        } else {
            this.unsigned = BigInteger.valueOf(signed & Long.MAX_VALUE).add(MAX_SIGNED_VALUE);
        }
    }

    /**
     * Down casts and returns this unsigned number as an {@code int}.
     *
     * @return the unsigned numeric value represented as {@code int}.
     */
    @Override
    public int intValue() {
        return unsigned.intValue();
    }

    /**
     * Returns this unsigned number as a signed {@code long}.
     *
     * @return the unsigned numeric value represented as signed {@code long}.
     */
    @Override
    public long longValue() {
        return unsigned.longValue();
    }

    /**
     * Returns this unsigned number as a {@code float}.
     *
     * @return the unsigned numeric value represented as {@code float}.
     */
    @Override
    public float floatValue() {
        return unsigned.floatValue();
    }

    /**
     * Returns this unsigned number as a {@code double}.
     *
     * @return the unsigned numeric value represented as {@code double}.
     */
    @Override
    public double doubleValue() {
        return unsigned.doubleValue();
    }

    /**
     * Returns this unsigned number as a {@code BigInteger}.
     *
     * @return the unsigned numeric value represented as {@code BigInteger}.
     */
    @Override
    public BigInteger bigIntegerValue() {
        return unsigned;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof UnsignedLong && Objects.equals(unsigned, ((UnsignedLong) o).unsigned);
    }

    @Override
    public String toString() {
        return unsigned.toString();
    }

    @Override
    public int compareTo(UnsignedLong o) {
        return unsigned.compareTo(o.unsigned);
    }
}
