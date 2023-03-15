package com.learning.loops;



public class WeekDay {
    public static boolean determineWeekDay(int number){
        return switch (number) {
            case 1, 2, 3, 4, 5 -> true;
            default -> false;
        };
    }
}
