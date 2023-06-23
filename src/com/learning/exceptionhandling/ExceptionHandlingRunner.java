package com.learning.exceptionhandling;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method1();
        System.out.println("Method ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 ended");
    }

    private static void method2() {
        try {
            String str = null;
            str.length();
            System.out.println("Method2 ended");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}