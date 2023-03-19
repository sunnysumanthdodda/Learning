package com.learning.collections.map.exercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCounter {
    private String sentence;

    public CharCounter(String sentence){
        this.sentence = sentence;
    }

    Map<Character,Integer> occurances = new LinkedHashMap<>();
    void print(){
        char[] chars = sentence.toCharArray();
        for( char character:chars){
            Integer integer = occurances.get(character);
            if(integer==null) occurances.put(character,1);
            else occurances.put(character,integer+1);
        }
        System.out.println(occurances);
    }
}
