package com.learning.leetcode;

public class MakeChocolate {
    public static void main(String[] args) {
        int small = 6, big = 2, goal = 7, count = 0;
        while((goal/(big*5))<1){
            count++;
            big--;
        }
        int result = goal - ((count)*5);
        if(result<=small) System.out.println(result);
        else System.out.println(-1);
    }
}
