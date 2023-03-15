package com.learning.primitivedatatypes.exercise2;

import java.util.Scanner;

public class MyCharRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        MyChar character = new MyChar(sc.next().charAt(0));
        if(character.isVowel()) System.out.println("The character "+character.getCh()+" is vowel");
        else System.out.println("The character "+character.getCh()+" is not vowel");
        character.isConsonant();
        character.isNumber();
        character.isLowerCase();
        character.isUpperCase();
        System.out.print("Lower Case Alphabets are: ");
        MyChar.printLowerCaseAlphabets();
        System.out.println();
        System.out.print("Upper Case Alphabets are: ");
        MyChar.printUpperCaseAlphabets();
    }
}
