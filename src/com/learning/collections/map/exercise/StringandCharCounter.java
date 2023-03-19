package com.learning.collections.map.exercise;

import java.util.Scanner;

public class StringandCharCounter {
    public static void main(String[] args) {
        CharCounter charCounter = new CharCounter("This is awesome course and I had enjoyed it very well");
        charCounter.print();
        WordCounter wordCounter = new WordCounter("I am eating I am sleeping I am drinking I am studying");
        wordCounter.print();
    }
}