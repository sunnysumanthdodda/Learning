package com.learning.leetcode;

import java.util.Scanner;

class Result1 {

    public static int countingValleys(String path) {
        // Write your code here
        int level = 0;  // Current level, starts at sea level
        int valleyCount = 0;  // Count of valleys

        for (char step : path.toCharArray()) {
            if (step == 'U') {
                level++;
            } else if (step == 'D') {
                // If going downhill and reaching sea level, count a valley
                if (level == 0) {
                    valleyCount++;
                }
                level--;
            }
        }
        return valleyCount;
    }
}
public class Solution2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        System.out.println(Result1.countingValleys(s));
    }
}
