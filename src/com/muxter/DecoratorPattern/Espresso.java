package com.muxter.DecoratorPattern;

/**
 * Created by matao on 07/02/2017.
 */
public class Espresso extends Beverage{

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1;
    }
}
