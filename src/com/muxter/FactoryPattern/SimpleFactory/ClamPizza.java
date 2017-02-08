package com.muxter.FactoryPattern.SimpleFactory;

/**
 * Created by matao on 08/02/2017.
 */
public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ClamPizza is preparing");
    }

    @Override
    public void bake() {
        System.out.println("ClamPizza is baking");
    }

    @Override
    public void cut() {
        System.out.println("ClamPizza is cutting");
    }

    @Override
    public void box() {
        System.out.println("ClamPizza is boxing");
    }
}
