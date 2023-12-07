package com.learning.hackerrank;

public class JumpingOnClouds {
    public static void main(String[] args) {
        int[] c = new int[]{0, 0, 1, 0, 0, 1, 1, 0};
        int k = 2, sum = 100, i = 0;
        do{
            i = (i+k) % c.length;
            sum--;
            if(c[i]==1) sum-=2;
        }while (i!=0);
        System.out.println(sum);
    }
}
