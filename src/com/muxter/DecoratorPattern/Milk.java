package com.muxter.DecoratorPattern;

/**
 * Created by matao on 07/02/2017.
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
