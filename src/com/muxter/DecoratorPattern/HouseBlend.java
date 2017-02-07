package com.muxter.DecoratorPattern;

/**
 * Created by matao on 07/02/2017.
 * 黑咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 2;
    }
}
