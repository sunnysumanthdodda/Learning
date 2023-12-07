package com.learning.hackerrank;

public class AppendAndDelete {
    public static void main(String[] args) {
        String s = "qwerty";
        String t = "zxcvbn";
        int k = 100;
//        for(int i = 1;i<s.length();i++){
//            String sub = s.substring(0,s.length()-i);
//            if(t.contains(sub)) {
//                index = i;
//                System.out.println(sub+" "+index);
//                break;
//            }
//            else index = i;
//        }
//        System.out.println(index);
//        if(index==s.length()-1) index+=1;
//        System.out.println(index);
//        int diff = t.length() - (s.length() - index);
//        System.out.println(diff);
//        if((index+diff)==k) System.out.println("Yes");
//        else System.out.println("No");
        if (s.length() + t.length() <= k) {
            System.out.println("Yes");
        }
        int commonLength = 0;

        // Find the common length from the start
        for (int i = 0; i < java.lang.Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
            commonLength++;
        }
        System.out.println(commonLength);

        // Total operations needed to transform s into t
        int totalOperations = (s.length() - commonLength) + (t.length() - commonLength);
        System.out.println(totalOperations);

        // Check if the total operations is within the allowed steps k
        // Also check if the difference in the number of operations and k is even
        // because we can perform unnecessary operations by appending and deleting the same character
        if (totalOperations <= k && (k - totalOperations) % 2 == 0) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
