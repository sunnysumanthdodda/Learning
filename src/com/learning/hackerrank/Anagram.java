package com.learning.hackerrank;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "margana";
//        Map<Character,Integer> map1 = new HashMap<>();
//        Map<Character,Integer> map2 = new HashMap<>();
//        for(int i=0;i<a.length();i++){
//            if(map1.containsKey(a.charAt(i))){
//                map1.put(a.charAt(i),map1.get(a.charAt(i))+1);
//            }
//            else map1.put(a.charAt(i),1);
//        }
//        for(int j=0;j<b.length();j++){
//            if(map2.containsKey(b.charAt(j))){
//                map2.put(b.charAt(j),map2.get(b.charAt(j))+1);
//            }
//            else map2.put(b.charAt(j),1);
//        }
//        System.out.println(map1);
//        System.out.println(map2);

        char[] str1 = a.toLowerCase().toCharArray();
        System.out.println(str1);
        char[] str2 = b.toLowerCase().toCharArray();
        System.out.println(str2);
        for(int j=0;j<=str1.length;j++){
            for(int i=0;i<str1.length-1;i++){
                char c = str1[i];
                if(str1[i]>str1[i+1]){
                    str1[i] = str1[i+1];
                    str1[i+1] = c;
                }
            }
        }
        for(int j=0;j<=str2.length;j++){
            for(int i=0;i<str2.length-1;i++){
                char c = str2[i];
                if(str2[i]>str2[i+1]){
                    str2[i] = str2[i+1];
                    str2[i+1] = c;
                }
            }
        }
        if(Arrays.equals(str1, str2)) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
