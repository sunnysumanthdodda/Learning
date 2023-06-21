package com.learning.filesanddirectories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderRunner {
    public static void main(String[] args) throws IOException {
        Path FiletoRead = Paths.get("./src/com/learning/filesanddirectories/data.txt");
        Files.readAllLines(FiletoRead).forEach(System.out::println);
        List<String> txt = List.of("Hello, My name is Sunny Sumanth Dodda","I am recent computer science graduate from University of North Texas");
        Path FiletoWrite = Paths.get("./src/com/learning/filesanddirectories/data.txt");
        Files.write(FiletoWrite,txt);
    }
}
