package com.learning.generics;

import java.util.ArrayList;

public class MyCustomList<T> {

    ArrayList<T> list = new ArrayList();

    public void addElement(T element){
        list.add(element);
    }

    public String toString(){
        return list.toString();
    }
}
