package com.learning.multithreading;

import java.util.stream.IntStream;

public class ThreadBasicsRunner {

    static class Task1 extends Thread{
        public void run(){
            IntStream.range(10,19).forEach(e->System.out.print(e+" "));
        }
    }

     static class Task2 implements Runnable{
         @Override
         public void run() {
             IntStream.range(20,29).forEach(e->System.out.print(e+" "));
         }
     }

    public static void main(String[] args) {
        System.out.println("\nTask1 Started");
        Task1 task1 = new Task1();
        task1.start();
        System.out.println("\nTask1 Done");
        System.out.println("\nTask2 Started");
        Task2 task2 = new Task2();
        Thread thread = new Thread(task2);
        thread.start();
        System.out.println("\nTask2 Done");
        System.out.println("\nTask3 Started");
        IntStream.range(30,39).forEach(e->System.out.print(e+" "));
        System.out.println("\nTask3 Done");
    }
}
