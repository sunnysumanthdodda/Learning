package com.learning.primitivedatatypes;

public class NumberRunner {
    public static void main(String[] args) {
        BiRunner numbers = new BiRunner(6,7);
        System.out.println("Addition of "+numbers.getA()+" and "+numbers.getB()+" is "+numbers.add());
        System.out.println("Multiplication of "+numbers.getA()+" and "+numbers.getB()+" is "+numbers.multiply());
        numbers.doubleValue();
        System.out.println(numbers.getA());
        System.out.println(numbers.getB());
    }
}
