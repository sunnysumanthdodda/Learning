package com.learning.collections.list;

public class Student implements Comparable<Student> {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id+" "+name;
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.id,that.id);
    }
}