package com.learning.hackerrank;

import java.util.*;
public class CutTheSticks {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
        Collections.sort(arr);
        while (!arr.isEmpty()) {
            System.out.println(arr.size());
            int cutLength = arr.get(0);
            // Remove all sticks of the current smallest length
            while (!arr.isEmpty() && arr.get(0) == cutLength) {
                arr.remove(0);
            }
        }
    }
}
