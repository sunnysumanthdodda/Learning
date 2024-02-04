package com.learning.threads;

class One implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=5;i++) System.out.println("Hi");
    }
}

class Two implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++) System.out.println("Hello");
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        Runnable obj1 = new One();
        Runnable obj2 = new Two();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}