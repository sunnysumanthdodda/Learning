package com.learning.inheritance.calculator;

public class Calculation {
    public static void main(String[] args) {

        VeryAdvCalculator advcalc = new VeryAdvCalculator();
        System.out.println(advcalc.addition(5,5));
        System.out.println(advcalc.subtraction(15,5));
        System.out.println(advcalc.multiplication(5,2));
        System.out.println(advcalc.division(50,5));
        System.out.println(advcalc.pow(5,6));
    }
}
