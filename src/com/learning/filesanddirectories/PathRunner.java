package com.learning.filesanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class PathRunner {

     private static final BiPredicate<Path, BasicFileAttributes> pathMatcher =
            ((path, basicFileAttributes) -> String.valueOf(path).contains(".java"));

    private static final BiPredicate<Path, BasicFileAttributes> directoryMatcher =
            ((path, basicFileAttributes) -> basicFileAttributes.isDirectory());

    public static void main(String[] args) throws IOException {
        Path currentDirectory = Paths.get(".");
        //Files.list(currentDirectory).forEach(System.out::println);
        Files
                .walk(currentDirectory,7)
                .filter(path -> String.valueOf(path).contains(".java"))
                .forEach(System.out::println);
        System.out.println();
        Files.find(currentDirectory,7,pathMatcher).forEach(System.out::println);
        System.out.println();
        Files.find(currentDirectory,7,directoryMatcher).forEach(System.out::println);
    }
}