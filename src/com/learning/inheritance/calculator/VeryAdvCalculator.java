package com.learning.inheritance.calculator;


 class Sample{
    public static int number(int n){
        return n;
    }
}
public class VeryAdvCalculator extends AdvCalculator {

    String s1 = "Sunny Sumanth ";
    String s2 = "Dodda";
    public int pow(int a,int b){
        return (int)Math.pow(a,Sample.number(b));
    }
}
