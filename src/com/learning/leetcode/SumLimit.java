package com.learning.leetcode;

import java.util.Scanner;

public class SumLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = scanner.nextInt();
        System.out.print("Enter b : ");
        int b = scanner.nextInt();
        int max = Math.max(String.valueOf(a).length(),String.valueOf(b).length());
        int sum = String.valueOf(a+b).length();
        System.out.println(max+","+sum);
    }
}
