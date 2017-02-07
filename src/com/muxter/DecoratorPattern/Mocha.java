package com.muxter.DecoratorPattern;

/**
 * Created by matao on 07/02/2017.
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
