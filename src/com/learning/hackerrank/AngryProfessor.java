package com.learning.hackerrank;

import java.util.*;

public class AngryProfessor {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(-93,-86,49,-62,-90,-63,40,72,11,67));
        int k = 4 , early = 0;
        for (Integer integer : a) {
            if (integer < 0) early++;
        }
        System.out.println(early);
        if(early>=k) System.out.println("NO");
        else System.out.println("YES");
    }
}
