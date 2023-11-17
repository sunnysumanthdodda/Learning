package com.learning.upgrades.lambdaexpressions;

@FunctionalInterface
interface A {
    void show(int i);

}
@FunctionalInterface
interface B{
    int add(int a, int b);
}
public class LambdaExpressions {
    public static void main(String[] args) {

        A obj = i -> System.out.println("in show");
        obj.show(7);
        B obj1 = Integer::sum;
        System.out.println(obj1.add(7,14));
    }
}
