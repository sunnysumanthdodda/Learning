package com.learning.hackerrank;

import java.util.*;
public class AcmTeam {
    public static void main(String[] args) {
        List<String> topic = new ArrayList<>(Arrays.asList("10101", "11100", "11010", "00101"));
        List<Integer> r1 = new ArrayList<>();
        int teamcount = 0, max = 0;
        for (int i = 0; i < topic.size(); i++) {
            for (int j = i; j < topic.size() - 1; j++) {
                int count = 0;
                for (int k = 0; k < topic.get(i).length(); k++) {
                    char c1 = topic.get(i).charAt(k);
                    char c2 = topic.get(j + 1).charAt(k);
                    if ((c1 == '1' || c2 == '1')) count++;
                }
                if(count>max) {
                    max = count;
                    teamcount = 1;
                }
                else if(count==max) teamcount++;
            }
        }
        r1.add(max);
        r1.add(teamcount);
        System.out.println(r1);
    }
}