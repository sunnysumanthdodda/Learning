package com.learning.practice.Amazon;

import java.util.*;

public class Demo2 {

    public static List<String> processLogs(String[] logs, int threshold) {
        Map<String, Integer> transactionCounts = new HashMap<>();

        for (String log : logs) {
            String[] parts = log.split(" ");
            String sender = parts[0];
            String receiver = parts[1];

            // Increment the sender's transaction count
            transactionCounts.put(sender, transactionCounts.getOrDefault(sender, 0) + 1);

            // Increment the receiver's transaction count if different from the sender
            if (!sender.equals(receiver)) {
                transactionCounts.put(receiver, transactionCounts.getOrDefault(receiver, 0) + 1);
            }
        }

        /*
         Filter the IDs based on the threshold and sort them
         Convert the list to an array before returning
        */

        return transactionCounts
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= threshold)
                .map(Map.Entry::getKey)
                .sorted(Comparator.comparingInt(Integer::valueOf))
                .toList();
    }

    public static void main(String[] args) {
        // Example usage
        String[] logs = {"88 99 200", "88 99 300", "99 32 100", "12 12 15"};
        int threshold = 2;

        List<String> result = processLogs(logs, threshold);
        System.out.println(result);
    }
}
