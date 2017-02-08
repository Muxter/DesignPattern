package com.muxter.FactoryPattern.SimpleFactory;

/**
 * Created by matao on 08/02/2017.
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("CheesePizza is preparing");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza is baking");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza is cutting");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza is boxing");
    }
}
