package com.learning.hackerrank;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        System.out.print("Enter p : ");
        int p = scanner.nextInt();
        if(n<0 || p<0) throw new Exception("n or p should not be negative.");
        else if(n==0 && p==0) throw new Exception("n and p should not be zero.");
        else System.out.println((int)Math.pow(n,p));
    }
}
