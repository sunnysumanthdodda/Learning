package com.learning.hackerrank;

import java.util.*;

public class PermutationEquation {
    public static void main(String[] args) {
        List<Integer> p = new ArrayList<>(Arrays.asList(4,3,5,1,2));
        List<Integer> index = new ArrayList<>();
        for(int i = 0;i <= p.size(); i++) {
            index.add(0);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < p.size();i++){
            index.set(p.get(i),i+1);
        }
        for(int i = 1;i<=p.size();i++){
            result.add(index.get(index.get(i)));
        }
        System.out.println(result);
    }
}
