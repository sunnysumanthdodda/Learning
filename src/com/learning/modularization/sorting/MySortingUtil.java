package com.learning.modularization.sorting;

import com.learning.modularization.algorithm.BubbleSort;

import java.util.List;

public class MySortingUtil {
    public List<String> sort(List<String> names){
        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(names);
    }
}