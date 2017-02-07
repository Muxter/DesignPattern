package com.muxter.ObserverPattern.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matao on 07/02/2017.
 */
public class WeatherData implements ISubject {

    private List<IObserver> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
