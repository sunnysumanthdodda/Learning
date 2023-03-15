package com.learning.interfaces.exercise2;

public class ProjectRunner {
    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new RealProject();
        System.out.println(algorithm.complexAlgorithm(10,20));
    }
}
