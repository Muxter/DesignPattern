package com.muxter.FactoryPattern.FactoryMethod;

/**
 * Created by matao on 08/02/2017.
 */
public class NewYorkStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NewYorkStyleCheesePizza is preparing");
    }

    @Override
    public void bake() {
        System.out.println("NewYorkStyleCheesePizza is baking");
    }

    @Override
    public void cut() {
        System.out.println("NewYorkStyleCheesePizza is cutting");
    }

    @Override
    public void box() {
        System.out.println("NewYorkStyleCheesePizza is boxing");
    }
}
