package com.learning.generics;

import java.util.*;

public class GenericsRunner {

    static <S extends List> void duplicateSet(S list){
        list.addAll(list);
    }
    public static void main(String[] args) {

        MyCustomList<String> list1 = new MyCustomList<>();
        list1.addElement("Sunny");
        list1.addElement("Sumanth");
        list1.addElement("Dodda");
        System.out.println(list1);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(7);
        list2.addElement(14);
        list2.addElement(21);
        System.out.println(list2);

        LinkedList<Integer> numbers = new LinkedList<>(Set.of(1,2,3));
        duplicateSet(numbers);
        System.out.println(numbers);
    }
}
