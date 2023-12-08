package com.learning.hackerrank;

public class ChocolateFeast {
    public static void main(String[] args) {
        int n = 15, c = 3, m = 2;
        int chocolates = n/c, total_chocolates = chocolates;
        while(chocolates>=m){
            int new_chocolates = chocolates/m;
            total_chocolates+=new_chocolates;
            chocolates = new_chocolates+(chocolates%m);
        }
        System.out.print(total_chocolates);
    }
}
