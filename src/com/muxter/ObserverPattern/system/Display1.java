package com.muxter.ObserverPattern.system;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by matao on 07/02/2017.
 */
public class Display1 implements Observer {

    public Display1(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            System.out.println("Display1 -- temperature: " + weatherData.getTemperature() + " humidity: " + weatherData.getHumidity() + " pressure: " + weatherData.getPressure());
        }
    }
}
