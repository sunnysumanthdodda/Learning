package com.learning.collections.map.exercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounter {
    private final String sentence;

    public WordCounter(String sentence){
        this.sentence = sentence;
    }

    Map<String, Integer> occurances = new LinkedHashMap<>();
    void print(){
        String[] words = sentence.split(" ");
        for(String word:words){
            Integer integer = occurances.get(word);
            if(integer==null) occurances.put(word,1);
            else occurances.put(word,integer+1);
        }
        System.out.println(occurances);
    }
}
