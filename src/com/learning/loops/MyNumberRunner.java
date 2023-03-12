package com.learning.loops;

import java.util.Scanner;

public class MyNumberRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required number : ");
        int num = sc.nextInt();
        MyNumber number = new MyNumber(num);

        if (number.isPrime()) System.out.println(number.getNumber()+" is prime number");
        else System.out.println(number.getNumber()+" is not prime number");

        System.out.print("Sum from 1 to "+number.getNumber()+" is : ");
        number.printNumbersforSum();
        System.out.println(" = "+number.sumUptoNumber());
        System.out.print("Sum of divisors of "+number.getNumber()+" is : ");
        if(!number.listofDivisors().isEmpty()) System.out.print(number.listofDivisors());
        if(number.sumofDivisors()==0) System.out.println(number.sumofDivisors());
        else System.out.println(" = "+number.sumofDivisors());

        System.out.println("Number triangle of "+number.getNumber()+" is ");
        number.numberTriangle();
    }
}
