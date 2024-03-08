package com.learning.hackerrank;

import java.util.*;
public class JavaLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a + (int) Math.pow(2,0) * b;
            System.out.print(sum+" ");
            for (int j = 1; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}