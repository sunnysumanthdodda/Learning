package com.learning.hackerrank;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int num = 25;
        BigInteger product = BigInteger.ONE;
        for(int i = 2; i<=num;i++){
            product = product.multiply(BigInteger.valueOf(i));
        }
        System.out.println(product);
    }
}
