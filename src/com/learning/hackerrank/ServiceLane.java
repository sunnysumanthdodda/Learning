package com.learning.hackerrank;

import java.util.*;

public class ServiceLane {
    public static void main(String[] args) {
        List<List<Integer>> cases = new ArrayList<>();
        cases.add(Arrays.asList(0,3));
        cases.add(Arrays.asList(4,6));
        cases.add(Arrays.asList(6,7));
        cases.add(Arrays.asList(3,5));
        cases.add(Arrays.asList(0,7));
        List<Integer> width = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3));
        List<Integer> result = new ArrayList<>();
        for (List<Integer> aCase : cases) {
            List<Integer> input = new ArrayList<>();
            for (int j = aCase.get(0); j <= aCase.get(1); j++) {
                input.add(width.get(j));
            }
            Collections.sort(input);
            result.add(input.get(0));
        }
        System.out.println(result);
    }
}
