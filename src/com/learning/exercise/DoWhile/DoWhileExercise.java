package com.learning.exercise.DoWhile;

import java.util.Scanner;

public class DoWhileExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("""
                    Menu List:
                    \t\t1.Addition
                    \t\t2.Subtraction
                    \t\t3.Multiplication
                    \t\t4.Division
                    \t\t5.Exit
                    """);
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter number1: ");
                double number1 = sc.nextDouble();
                System.out.print("Enter number2: ");
                double number2 = sc.nextDouble();
                if (choice == 1)
                    System.out.println("Addition of " + number1 + " and " + number2 + " is: " + (number1 + number2));
                else if (choice == 2) {
                    if (number1 > number2)
                        System.out.println("Subtraction of " + number1 + " and " + number2 + " is: " + (number1 - number2));
                    else System.out.println("Number1 should be greater than Number2");
                } else if (choice == 3)
                    System.out.println("Multiplication of " + number1 + " and " + number2 + " is: " + (number1 * number2));
                else {
                    if (number1 > number2)
                        System.out.println("Division of " + number1 + " and " + number2 + " is: " + (number1 / number2));
                    else System.out.println("Number1 should be greater than Number2");
                }
            }
        } while(choice<5); {
            if(choice==5) System.out.println("Thank you.. Have a Nice Day");
            else System.out.println("Please enter the correct option in the list");
        }

    }
}
