package com.learning.primitivedatatypes.exercise3;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5");
        BigDecimal totalValue = calculator.calculatetotalValue(5);
        System.out.println("Total value after simple interest is: "+totalValue);
    }
}
