package com.muxter.DecoratorPattern;

/**
 * Created by matao on 07/02/2017.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
