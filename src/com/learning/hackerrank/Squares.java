package com.learning.hackerrank;

public class Squares {
    public static void main(String[] args) {
        int m = 100, n = 10000;
        int l = (int)Math.ceil(Math.sqrt(m));
        System.out.println(l);
        int h = (int)Math.floor(Math.sqrt(n));
        System.out.println(h);
        System.out.println(h-l+1);
    }
}
