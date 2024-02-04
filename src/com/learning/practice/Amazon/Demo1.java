package com.learning.practice.Amazon;

import java.util.*;

public class Demo1 {

    // Helper method to preprocess the counts of '*' within valid compartments
    private static int[] preprocess(String s) {
        int n = s.length();
        int[] count = new int[n];
        int sum = 0;
        int lastBarIndex = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '|') {
                lastBarIndex = i;
                count[i] = sum;
            } else if (lastBarIndex != -1) {
                sum++; // Only count '*' if we've seen a '|' before
            }
        }
        return count;
    }

    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        List<Integer> result = new ArrayList<>();
        int[] validCounts = preprocess(s);

        for (int i = 0; i < startIndices.size(); i++) {
            int start = startIndices.get(i) - 1;
            int end = endIndices.get(i) - 1;

            // Move 'start' to the right to the next '|'
            while (start < s.length() && s.charAt(start) != '|') {
                start++;
            }
            // Move 'end' to the left to the previous '|'
            while (end >= 0 && s.charAt(end) != '|') {
                end--;
            }

            // Calculate the result if valid compartments are found
            if (start < end) {
                result.add(validCounts[end] - validCounts[start]);
            } else {
                result.add(0);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = scanner.next();
        List<Integer> startIndices = List.of(1, 1);
        List<Integer> endIndices = List.of(3, 6);

        System.out.println(new ArrayList<>(numberOfItems(s,startIndices,endIndices)));
    }
}
