package com.learning.exceptionhandling;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(br.readLine());
        }
    }
}