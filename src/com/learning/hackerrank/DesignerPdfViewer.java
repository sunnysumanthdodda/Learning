package com.learning.hackerrank;

import java.util.*;

public class DesignerPdfViewer {
    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>(Arrays.asList(1,3,1,3,1,4,1,3,2,5,5,5,5,1,1,5,5,1,5,2,5,5,5,5,5,5));
        String word = "abc";
        int max = 0;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i)-96;
            if(max < h.get(index)) max = h.get(index);
        }
        System.out.println(max*word.length());
    }
}
