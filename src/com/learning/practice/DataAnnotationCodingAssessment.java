package com.learning.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataAnnotationCodingAssessment {
    static Map<Integer, String> inputMap = null;
    public static void main(String[] args) {
        //Reading input from the path
        String filePath = "/Users/sunnysumanthdodda/Desktop/Projects/Learning/coding_qual_input.txt";
        try {
            inputMap = convertFiletoReadableMap(filePath);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        // declaring inputMap as not null
        assert inputMap!=null;
        System.out.println(getDecodedMessage(getValuesfromPyramid(inputMap.size())));
    }

    private static StringBuilder getDecodedMessage(List<List<Integer>> pyramid) {
        StringBuilder output = new StringBuilder();
        for (List<Integer> integers : pyramid) {
            output.append(inputMap.get(integers.get(integers.size() - 1))).append(" ");
        }
        return output;
    }

    private static List<List<Integer>> getValuesfromPyramid(int size) {
        List<List<Integer>> pyramid = new ArrayList<>();
        pyramid.add(List.of(1));
        int currentNumber = 2,i=2,flag=0;
        while(currentNumber<=size){
            List<Integer> l = new ArrayList<>();
            for (int k = 1; k <= i; k++) {
                l.add(currentNumber);
                currentNumber++;
                if(currentNumber==size) {
                    flag=1;
                    l.add(currentNumber);
                    break;
                }
            }
            if(l.size()> pyramid.size()) pyramid.add(l);
            if(flag==1) break;
            i++;
        }
        return pyramid;
    }

    private static Map<Integer, String> convertFiletoReadableMap(String filePath) throws IOException {
        Map<Integer, String> dataMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    int key = Integer.parseInt(parts[0].trim());
                    String value = parts[1].trim();
                    dataMap.put(key, value);
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }
        }
        return dataMap;
    }
}