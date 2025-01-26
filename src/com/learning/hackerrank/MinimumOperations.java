package com.learning.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MinimumOperations {

    public static int getMinimumOperations(List<Integer> items) {
        // Convert the input list to a mutable ArrayList
        List<Integer> mutableItems = new ArrayList<>(items);

        int operations = 0;
        int n = mutableItems.size();

        for (int i = 0; i < n - 1; i++) {
            // If consecutive elements have the same parity
            while (mutableItems.get(i) % 2 == mutableItems.get(i + 1) % 2 && mutableItems.get(i + 1) > 0) {
                // Divide the second element by 2 to change its parity
                mutableItems.set(i + 1, mutableItems.get(i + 1) / 2);
                operations++;

                // If the parity changes, stop dividing further
                if (mutableItems.get(i) % 2 != mutableItems.get(i + 1) % 2) {
                    break;
                }

                // If the second element becomes zero, stop further operations
                if (mutableItems.get(i + 1) == 0) {
                    break;
                }
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        // Example test case
        List<Integer> items = List.of(4, 10, 10, 6, 3);
        int result = getMinimumOperations(items);
        System.out.println(result);  // Should print 3
    }
}


