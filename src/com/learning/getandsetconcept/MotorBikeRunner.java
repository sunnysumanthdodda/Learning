package com.learning.getandsetconcept;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.setSpeed(90);
        System.out.println("Speed of ducati is: " + ducati.getSpeed() + " mph");
        honda.setSpeed(60);
        System.out.println("Speed of honda is: " + honda.getSpeed() + " mph");
    }
}