package com.github.ccarpenter04.unsigned_types;

import java.math.BigInteger;

/**
 * UnsignedNumber
 * <p>
 * A class representing an unsigned number.
 * <p>
 * Java has no primitive support for unsigned datatypes, therefore masking and casting to higher level primitives are
 * required to perform basic arithmetic.
 *
 * @author Chris Carpenter
 * @author Ian Caffey
 * @since 1.0
 */
public abstract class UnsignedNumber<T extends UnsignedNumber> extends Number implements Comparable<T> {
    /**
     * Returns this unsigned number as a {@code BigInteger}.
     *
     * @return the unsigned numeric value represented as {@code BigInteger}.
     */
    public BigInteger bigIntegerValue() {
        return new BigInteger(toString());
    }

    /**
     * Abstract method forcing subclasses to provide unique implementation overriding {@code Object} implementations.
     *
     * @return a hash code value for this object.
     */
    @Override
    public abstract int hashCode();

    /**
     * Abstract method forcing subclasses to provide unique implementation overriding {@code Object} implementations.
     *
     * @return {@code true} if this number is the same as the o argument; {@code false} otherwise.
     */
    @Override
    public abstract boolean equals(Object o);

    /**
     * Abstract method forcing subclasses to provide unique implementation overriding {@code Object} implementations.
     *
     * @return a string representation of the number.
     */
    @Override
    public abstract String toString();
}
