package com.learning.sample;

import java.io.*;

class Result {

    public static long repeatedString(String s, long n) {
        String result = "";
        int count = 0;
        if(s.equals("a")) return n;
        else{
            for(int i=0;i<n;i++){
                result+=s.charAt(i);
            }
            for(int i=0;i<result.length();i++){
                if(result.charAt(i)=='a') count++;
            }
            return count;
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
