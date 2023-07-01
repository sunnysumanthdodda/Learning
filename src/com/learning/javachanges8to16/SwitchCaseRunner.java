package com.learning.javachanges8to16;

import java.util.Scanner;

public class SwitchCaseRunner {

    private static String dayofWeek(int day) {
        return switch (day){
            case 0 -> {
                System.out.println("This is Holy Day");
                yield  "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number : ");
        int day = scanner.nextInt();
        System.out.println(dayofWeek(day));
        scanner.close();
    }
}