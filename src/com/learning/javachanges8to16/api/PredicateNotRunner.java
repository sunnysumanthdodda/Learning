package com.learning.javachanges8to16.api;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

    public static boolean isEven(Integer number){
        return number%2==0;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
//        Predicate<Integer> evenPredicate = number -> number%2==0;
//        list.stream().filter(evenPredicate.negate()).forEach(e->System.out.print(e+" "));
        list.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(e->System.out.print(e+" "));
    }
}
