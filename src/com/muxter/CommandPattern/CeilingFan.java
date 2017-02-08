package com.muxter.CommandPattern;

/**
 * Created by matao on 08/02/2017.
 */
public class CeilingFan {

    public static enum SpeedLevel {
        OFF, LOW, MEDIUM, HIGH;
    }

    private SpeedLevel speed;

    public CeilingFan() {
        this.speed = SpeedLevel.OFF;
    }

    public void high() {
        this.speed = SpeedLevel.HIGH;
        System.out.println("Fan is running in high speed");
    }

    public void medium() {
        this.speed = SpeedLevel.MEDIUM;
        System.out.println("Fan is running in medium speed");
    }

    public void low() {
        this.speed = SpeedLevel.LOW;
        System.out.println("Fan is running in low speed");
    }

    public void off() {
        this.speed = SpeedLevel.OFF;
        System.out.println("Fan is off");
    }

    public SpeedLevel getSpeed() {
        return speed;
    }
}
