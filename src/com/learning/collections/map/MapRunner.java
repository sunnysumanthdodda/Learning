package com.learning.collections.map;

import java.util.*;

public class MapRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        for(int i=1;i<=5;i++){
            System.out.print("Enter the String value --> ");
            String s = sc.next();
            System.out.print("Enter the Integer value --> ");
            int num = sc.nextInt();
            map.put(s,num);
        }
        System.out.println(map);
    }
}