package com.learning.sample;

class Sample {
    public static void main(String[] args){
        String s = "Sunny Sumanth Dodda";
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1) System.out.print(s.charAt(i));
            else if(s.charAt(i)==' ') System.out.print(" ");
            else if(s.charAt(i+1)==' ') System.out.print(s.charAt(i));
            else System.out.print(s.charAt(i)+",");
        }
    }
}