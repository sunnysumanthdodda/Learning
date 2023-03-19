package com.learning.collections.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characterList = List.of('S','U','N','N','Y','D','Z','J');

        // Output will be in the random order without duplicates
        Set<Character> hashSet = new HashSet<>(characterList);
        System.out.println("HashSet --> "+hashSet);

        // Output will be in the given insertion order without duplicates
        Set<Character> linkedHashSet = new LinkedHashSet<>(characterList);
        System.out.println("LinkedHashSet --> "+linkedHashSet);

        // Output will be in the sorted order of given input without duplicates
        Set<Character> treeSet = new TreeSet<>(characterList);
        System.out.println("TreeSet --> "+treeSet);
    }
}