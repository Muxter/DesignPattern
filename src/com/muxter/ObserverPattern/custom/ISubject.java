package com.muxter.ObserverPattern.custom;

/**
 * Created by matao on 07/02/2017.
 */
public interface ISubject {
    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObservers();
}
