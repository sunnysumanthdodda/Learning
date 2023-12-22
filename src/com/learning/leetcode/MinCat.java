package com.learning.leetcode;

public class MinCat {
    public static void main(String[] args) {
        String a = "Hello", b = "java";
        int min = b.length();
        String s = a.substring(a.length()-min)+ b;
        System.out.println(s);
    }
}
