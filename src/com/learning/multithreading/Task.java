package com.learning.multithreading;

public class Task extends Thread{

    private final int number;
    public Task(int number){
        this.number = number;
    }

    public void run(){
        System.out.println("\n"+"Task"+number+" started");
        for(int i=number;i<=number+9;i++) System.out.print(i+" ");
        System.out.println("\n"+"Task"+number+" Done");
    }
}
