package com.learning.collections.list;

import java.util.*;

class Human{
    int age;
    String name;

    public Human(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "age=" + age + ", name=" + name ;
    }
}
public class Compare {
    public static void main(String[] args) {

        Comparator<Human> comparator = (i,j) -> j.age > i.age ? 1 : -1;

        List<Human> humans = new ArrayList<>();
        humans.add(new Human(35,"Manohar"));
        humans.add(new Human(16,"Praneeth"));
        humans.add(new Human(25,"Sumanth"));
        humans.add(new Human(50,"Prasad"));

        humans.sort(comparator);
        for(Human human:humans) System.out.println(human);
    }
}