package com.learning.exceptionhandling;

public class Demo {
   public static void main(String[] args) {
    try{
        int result = 18/0;
    }
    catch(Exception e){
        System.out.println("Cannot divide by zero");
    }
   } 
}
