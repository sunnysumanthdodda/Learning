package com.learning.hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class KaprekarNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt(), flag = 0;
        System.out.print(1+" ");
        for(int i=4;i<=n;i++){
            BigInteger square = new BigInteger(String.valueOf(BigInteger.valueOf((long) i*i)));
                String s = String.valueOf(square);
                int sum = Integer.parseInt(s.substring(0,s.length()/2)) + Integer.parseInt(s.substring(s.length()/2));
                if(sum==i) {
                    flag = 1;
                    System.out.print(i+" ");
                }
            }
        if(flag==0) System.out.print("INVALID RANGE");
//        BigInteger square = new BigInteger(String.valueOf(BigInteger.valueOf((long) n *n)));
//        String s = String.valueOf(square);
//        System.out.println(s);
//        int sum = Integer.parseInt(s.substring(0,s.length()/2)) + Integer.parseInt(s.substring(s.length()/2));
//        System.out.print(sum);
    }
}
