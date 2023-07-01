package com.learning.javachanges8to16.sorting;

import com.learning.javachanges8to16.algorithm.BubbleSort;

import java.util.List;

public class MySortingUtil {
    public List<String> sort(List<String> names){
        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(names);
    }
}