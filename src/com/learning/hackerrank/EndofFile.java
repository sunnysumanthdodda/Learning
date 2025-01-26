package com.learning.hackerrank;

import java.io.*;

public class EndofFile {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/sunnysumanthdodda/Desktop/Projects/Learning/coding_qual_input.txt";
        int i=1;
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            while(reader.readLine()!=null){
                System.out.println(i+ " "+reader.readLine());
                i++;
            }
        }
    }
}
