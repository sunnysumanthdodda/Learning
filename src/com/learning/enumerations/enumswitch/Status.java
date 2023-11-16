package com.learning.enumerations.enumswitch;

import java.util.Scanner;

enum Signal{
    Yellow, Green, Red
}
public class Status {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = scanner.nextLine();
        Signal signal = Signal.valueOf(text);
        switch (signal){
            case Yellow -> System.out.println("Check surroundings and go slow");
            case Red -> System.out.println("Stop");
            case Green -> System.out.println("Go");
        }
    }
}
