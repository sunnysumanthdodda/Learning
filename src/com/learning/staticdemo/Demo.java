package com.learning.staticdemo;

class Mobile{
    String brand;
    int price;
    static String name;

    static {
        name = "SmartPhone";
        System.out.println("in static block");
    }
    public void show(){
        System.out.println(brand+" costs $"+price+" which is a "+name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand+" costs $"+obj.price+" which is a "+name);
    }
}

public class Demo {
    public static void main(String[] args){
        Mobile mb1 = new Mobile();
        mb1.brand = "Apple";
        mb1.price = 1500;

        Mobile mb2 = new Mobile();
        mb2.brand = "Samsung";
        mb2.price = 1700;

        mb1.show();
        mb2.show();

        Mobile.show1(mb1);
    }
}