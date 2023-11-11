package com.learning.constructor;


class A{
    public A(){
        System.out.println("in A block");
    }

    public A(int a){
        System.out.println("in A integer block");
    }
}

class B extends A{
    public B(){
        System.out.println("in B block");
    }

    public B(int b){
        System.out.println("in B integer block");
    }
}
public class Demo {
    public static void main(String[] args) {
        new B(5);
    }
}
