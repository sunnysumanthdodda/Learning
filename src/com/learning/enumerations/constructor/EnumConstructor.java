package com.learning.enumerations.constructor;

enum Laptop{
    Macbook(1499),DellXPS(1799),Surface(1599);

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
public class EnumConstructor {
    public static void main(String[] args) {
        for(Laptop laptop: Laptop.values()){
            System.out.println("Price of "+laptop+" is : $"+laptop.getPrice());
        }
    }
}
