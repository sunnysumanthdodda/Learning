package com.learning.hackerrank;

public class Practice {

    static int factorial(int n) {
        int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    public static void main(String[] args) {
        int n = 4;
        int fact = factorial(4)/(factorial(4-2)*factorial(2));
        for(int i = 0 ; i < fact ; i++){
            for(int j = i; j < n-1;j++){
                System.out.print(j+1+" ");
                System.out.println(j+2+" ");
            }
            System.out.println();
        }
    }
}
