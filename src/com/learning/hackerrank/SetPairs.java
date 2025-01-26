package com.learning.hackerrank;

import java.util.*;
public class SetPairs {
    public static void main(String[] args) {

        String [] pair_left = new String[]{"john","john","john","mary","mary"};
        String [] pair_right = new String[]{"tom","mary","tom","anna","anna"};

        Set<String> uniquePairs = new HashSet<>();

        for(int i=0;i<pair_left.length;i++){
            String pair = pair_left[i] + " " + pair_right[i];
            uniquePairs.add(pair);
            System.out.println(uniquePairs.size());
        }
    }
}
