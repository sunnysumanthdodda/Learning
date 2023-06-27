package com.learning.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderRunner {
    public static void main(String[] args) {
        Map<Character, LongAdder> occurances = new Hashtable<>();
        String str = "ABCD SPACE ABCD SPACE ABCD";
//        for(char character:str.toCharArray()){
//            LongAdder longAdder = occurances.get(character);
//            if(longAdder==null) longAdder = new LongAdder();
//            longAdder.increment();
//            occurances.put(character,longAdder);
//        }

        for(char character:str.toCharArray()){
            occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
        }
        System.out.println(occurances);
    }
}
