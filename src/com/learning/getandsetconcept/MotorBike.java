package com.learning.getandsetconcept;

public class MotorBike {
    private int speed;
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        }
    }

    public void increaseSpeed(int value){
        setSpeed(this.speed + value);
    }

    public void decreaseSpeed(int value){
        setSpeed(this.speed - value);
    }
}
