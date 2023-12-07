package com.learning.hackerrank;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int[] s = new int[]{1, 3, 2, 6, 1, 2};
        int k = 3, count = 0;
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if((s[i]+s[j])%k==0) count++;
            }
        }
        System.out.println(count);
    }
}
