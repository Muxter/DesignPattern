package com.muxter.ObserverPattern.system;

/**
 * Created by matao on 07/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        Display1 display1 = new Display1(data);
        Display2 display2 = new Display2(data);

        data.setMeasurements(1, 2, 3);
        data.setMeasurements(2, 3, 4);
    }
}
