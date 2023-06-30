package com.learning.modularization;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyofAPIRunner {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/sunnysumanthdodda/Desktop/Learning/src/com/learning/modularization/text.txt");
        System.out.println(Files.readString(path));
        Files.writeString(path,Files.readString(path).replace("Lines","Sample"));
    }
}
