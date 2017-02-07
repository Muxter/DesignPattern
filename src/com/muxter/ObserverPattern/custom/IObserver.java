package com.muxter.ObserverPattern.custom;

/**
 * Created by matao on 07/02/2017.
 */
public interface IObserver {
    public void update(float temperature, float humidity, float pressure);
}
