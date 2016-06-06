package com.github.ccarpenter04.unsigned_types;

import java.math.BigInteger;

public abstract class UnsignedNumber<T extends UnsignedNumber> extends Number implements Comparable<T>{
    public abstract String toString();

    public BigInteger bigIntegerValue() {
        return new BigInteger(toString());
    }
}
