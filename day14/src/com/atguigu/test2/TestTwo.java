package com.atguigu.test2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class TestTwo {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("89098409283049820348203489");
        BigInteger bigInteger2 = new BigInteger("98779487987593845");

        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.subtract(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
        System.out.println(bigInteger1.divide(bigInteger2));
        System.out.println(bigInteger1.remainder(bigInteger2));

        System.out.println("-------------------------------------------------------");

        BigDecimal bigDecimal1 = new BigDecimal("545353535378979842.64534535");
        BigDecimal bigDecimal2 = new BigDecimal("342734897384.23232323");

        System.out.println(bigDecimal1.add(bigDecimal2));
        System.out.println(bigDecimal1.subtract(bigDecimal2));
        System.out.println(bigDecimal1.multiply(bigDecimal2));
        System.out.println(bigDecimal1.divide(bigDecimal2, RoundingMode.CEILING));
        System.out.println(bigDecimal1.remainder(bigDecimal2));
    }
}
