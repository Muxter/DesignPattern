package com.muxter.ObserverPattern.custom;

/**
 * Created by matao on 07/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Display1 display1 = new Display1(weatherData);
        Display2 display2 = new Display2(weatherData);
        weatherData.setMeasurements(1, 2, 3);
        weatherData.setMeasurements(2, 3, 4);
    }
}
