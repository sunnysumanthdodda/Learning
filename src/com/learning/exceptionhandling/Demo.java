package com.learning.exceptionhandling;

public class Demo {
   public static void main(String[] args) {
       int result = 0;
       try {
           result = 18 / 0;
       } catch (Exception e) {
           System.out.println("Cannot divide by zero");
       }
       System.out.println(result);
   } 
}
