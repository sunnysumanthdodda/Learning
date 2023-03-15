package com.learning.loops;

public class NameofDay {
    public static String determinenameOfDay(int number) {
        return switch (number) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Enter correct Day number";
        };
    }
}

