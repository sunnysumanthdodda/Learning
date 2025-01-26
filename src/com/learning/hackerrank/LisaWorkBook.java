package com.learning.hackerrank;

import java.util.*;

public class LisaWorkBook {
    public static void main(String[] args) {
        int n = 5, k = 3, currentPage = 1, splPrblm = 0;
        List<Integer> chapters = new ArrayList<>(List.of(4, 2, 6, 1, 10));

        for (int problemsInChapter : chapters) {
            for (int problemNumber = 1; problemNumber <= problemsInChapter; problemNumber++) {
                if (problemNumber == currentPage) {
                    splPrblm++;
                }
                if (problemNumber % k == 0 || problemNumber == problemsInChapter) {
                    currentPage++;
                }
            }
        }
        System.out.println(splPrblm);
    }
}