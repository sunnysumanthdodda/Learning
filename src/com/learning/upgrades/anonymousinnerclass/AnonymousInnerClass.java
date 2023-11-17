package com.learning.upgrades.anonymousinnerclass;

interface A{
    void show();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in show");
            }
        };
        obj.show();
    }
}
