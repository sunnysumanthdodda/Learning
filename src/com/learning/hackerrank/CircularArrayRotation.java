package com.learning.hackerrank;

import java.util.*;

public class CircularArrayRotation {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> queries = new ArrayList<>(Arrays.asList(0,1,2));

        int n = a.size() , k = 2;
        List<Integer> result = new ArrayList<>();

        k = k % n;

        Collections.rotate(a, k);

        for(int i = 0; i<queries.size();i++){
            result.add(a.get(queries.get(i)));
        }

        // Handle the queries
        System.out.println(result);
    }
}