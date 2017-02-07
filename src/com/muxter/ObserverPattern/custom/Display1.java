package com.muxter.ObserverPattern.custom;

/**
 * Created by matao on 07/02/2017.
 */
public class Display1 implements IObserver {

    private ISubject weatherData;

    public Display1(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Display1 -- temperature: " + temperature + " humidity: " + humidity + " pressure: " + pressure);
    }
}
