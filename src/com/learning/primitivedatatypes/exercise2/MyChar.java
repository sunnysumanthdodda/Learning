package com.learning.primitivedatatypes.exercise2;

public class MyChar {
    private final char ch;

    public char getCh() {
        return ch;
    }

    public MyChar(char ch){
        this.ch = ch;
    }

    public boolean isVowel() {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public void isConsonant(){
        if(isVowel()) System.out.println("The character "+getCh()+" is not consonant");
        else System.out.println("The character "+getCh()+" is consonant");
    }

    public void isNumber() {
        if(ch >= 48 && ch <=57) System.out.println("The character "+getCh()+" is number");
        else System.out.println("The character "+getCh()+" is not number");
    }

    public void isLowerCase() {
        if(ch >= 97 && ch <=122) System.out.println("The character "+getCh()+" is lowercase Alphabet");
        else System.out.println("The character "+getCh()+" is not lowercase Alphabet");
    }

    public void isUpperCase() {
        if(ch >= 65 && ch <=90) System.out.println("The character "+getCh()+" is uppercase Alphabet");
        else System.out.println("The character "+getCh()+" is not uppercase Alphabet");
    }

    public static void printLowerCaseAlphabets() {
        for(int i=97;i<=122;i++){
            char c = (char) i;
            System.out.print(c+" ");
        }
    }

    public static void printUpperCaseAlphabets() {
        for(int i=65;i<=90;i++){
            char c = (char) i;
            System.out.print(c+" ");
        }
    }
}
