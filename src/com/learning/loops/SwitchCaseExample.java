package com.learning.loops;

import java.util.Scanner;
public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required number: ");
        int number = sc.nextInt();
        System.out.println(NameofDay.determinenameOfDay(number));
        System.out.println(NameofMonth.determinenameOfMonth(number));
        if(WeekDay.determineWeekDay(number)) System.out.println(NameofDay.determinenameOfDay(number)+" is WeekDay");
        else System.out.println("Not a WeekDay");
    }
}
