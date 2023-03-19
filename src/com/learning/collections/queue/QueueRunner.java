package com.learning.collections.queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.addAll(List.of("Zebra", "Monkey", "Cat", "Rat", "Donkey", "Lion", "Tiger", "Cheetah"));
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
