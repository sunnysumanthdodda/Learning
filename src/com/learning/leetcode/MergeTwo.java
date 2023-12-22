package com.learning.leetcode;

import java.util.Arrays;

public class MergeTwo {
    public static void main(String[] args) {
        String[] a = {"x", "y", "z"};
        String[] b = {"a", "b", "z"};
        int n = 3;
        String[] newArr = new String[n];
        int aPos = 0;
        int bPos = 0;
        for (int i = 0; i < n; i++) {
            if (a[aPos].compareTo(b[bPos]) < 0) {
                newArr[i] = a[aPos];
                aPos++;
            }
            else if (a[aPos].compareTo(b[bPos]) > 0) {
                newArr[i] = b[bPos];
                bPos++;
            }
            else {
                newArr[i] = a[aPos];
                aPos++;
                bPos++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
