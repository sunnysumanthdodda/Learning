package com.learning.primitivedatatypes.exercise1;

public class BiNumber {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    BiNumber(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double add(){
        return this.a + this.b;
    }

    public double multiply(){
        return this.a*this.b;
    }

    void doubleValue(){
        this.a = Math.pow(this.a,2);
        this.b = Math.pow(this.b,2);
    }
}
