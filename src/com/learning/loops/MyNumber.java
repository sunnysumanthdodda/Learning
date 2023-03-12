package com.learning.loops;

import java.util.ArrayList;
import java.util.List;

public class MyNumber {

    private int number;

    public int getNumber() {
        return number;
    }

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public void printNumbersforSum(){
        for(int i=1;i<=number;i++){
            if (number==i) System.out.print(i);
            else System.out.print(i+"+");
        }
    }

    public int sumUptoNumber() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumofDivisors() {
        int sum = 0;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }

    public void numberTriangle() {
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++) {
                if (j==i) System.out.println(j);
                else System.out.print(j+",");
            }
        }
    }

    public List<Integer> listofDivisors() {
        List<Integer> divisors = new ArrayList<>();
        for(int i=2;i<number;i++){
            if((number % i) == 0) divisors.add(i);
        }
        return divisors;
    }
}
