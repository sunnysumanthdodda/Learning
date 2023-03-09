package com.learning.getandsetconcept;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.setSpeed(90);
        System.out.println("Speed of ducati before increasing is: " + ducati.getSpeed() + " mph");
        ducati.increaseSpeed(100);
        System.out.println("Speed of ducati after increasing is: " + ducati.getSpeed() + " mph");
        honda.setSpeed(60);
        System.out.println("Speed of honda before increasing is: " + honda.getSpeed() + " mph");
        honda.increaseSpeed(100);
        System.out.println("Speed of honda after increasing is: " + honda.getSpeed() + " mph");
    }
}