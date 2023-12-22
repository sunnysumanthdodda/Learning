package com.learning.leetcode;

import java.util.Scanner;

public class EvenlySpaced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = scanner.nextInt();
        System.out.print("Enter b : ");
        int b = scanner.nextInt();
        System.out.print("Enter c : ");
        int c = scanner.nextInt();
        int med;
        int min = Math.min(Math.min(a,b),c);
        int max = Math.max(Math.max(a,b),c);
        if(a<=b && a>=c) med = a;
        else if(b<=a && b>=c) med = b;
        else med = c;
        System.out.println(min+","+med+","+max);
    }
}
