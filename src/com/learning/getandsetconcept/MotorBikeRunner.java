package com.learning.getandsetconcept;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        // Initializing values for ducati and honda
        ducati.setSpeed(100);
        System.out.println("Speed of ducati before increasing is: " + ducati.getSpeed() + " mph");
        honda.setSpeed(70);
        System.out.println("Speed of honda before increasing is: " + honda.getSpeed() + " mph");

        // Increasing speed for ducati and honda
        ducati.increaseSpeed(100);
        System.out.println("Speed of ducati after increasing is: " + ducati.getSpeed() + " mph");
        honda.increaseSpeed(100);
        System.out.println("Speed of honda after increasing is: " + honda.getSpeed() + " mph");

        // Decreasing speed for ducati and honda
        ducati.decreaseSpeed(70);
        System.out.println("Speed of ducati after decreasing is: " + ducati.getSpeed() + " mph");
        honda.decreaseSpeed(70);
        System.out.println("Speed of honda after decreasing is: " + honda.getSpeed() + " mph");
    }
}