package com.learning.loops;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Menu List:
                \t\t1.Addition
                \t\t2.Subtraction
                \t\t3.Multiplication
                \t\t4.Division
                """);
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if(choice>=1 && choice<=4){
            System.out.print("Enter number1: ");
            double number1 = sc.nextDouble();
            System.out.print("Enter number2: ");
            double number2 = sc.nextDouble();
            if(choice==1) System.out.println("Addition of "+number1+" and "+number2+" is: "+(number1+number2));
            else if(choice==2){
                if(number1>number2) System.out.println("Subtraction of "+number1+" and "+number2+" is: "+(number1-number2));
                else System.out.println("Number1 should be greater than Number2");
            }
            else if(choice==3) System.out.println("Multiplication of "+number1+" and "+number2+" is: "+(number1*number2));
            else {
                if(number1>number2) System.out.println("Division of "+number1+" and "+number2+" is: "+(number1/number2));
                else System.out.println("Number1 should be greater than Number2");
            }
        }
        else System.out.println("Please enter the choice in the list");
    }
}
