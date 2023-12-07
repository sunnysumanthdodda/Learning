package com.learning.hackerrank;

import java.util.*;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,2,3,1,2));
        Map<Integer, Integer> frequency = new HashMap<>();
        // Populate the frequency map
        for (int num : a) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        System.out.println(frequency);

        int maxLength = 0;

        // Calculate the maximum length
        for (int num : frequency.keySet()) {
            int currentLength = frequency.get(num) + frequency.getOrDefault(num + 1, 0);
            maxLength = Math.max(maxLength, currentLength);
        }
        System.out.println(maxLength);
    }
}
