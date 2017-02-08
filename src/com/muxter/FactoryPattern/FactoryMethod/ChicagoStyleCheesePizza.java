package com.muxter.FactoryPattern.FactoryMethod;

/**
 * Created by matao on 08/02/2017.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleCheesePizza is preparing");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleCheesePizza is baking");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyleCheesePizza is cutting");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleCheesePizza is boxing");
    }
}
