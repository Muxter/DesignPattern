package com.muxter.StatePattern;

/**
 * Created by matao on 10/02/2017.
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
