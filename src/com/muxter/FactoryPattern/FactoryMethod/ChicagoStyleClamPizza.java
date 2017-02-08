package com.muxter.FactoryPattern.FactoryMethod;

/**
 * Created by matao on 08/02/2017.
 */
public class ChicagoStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoStyleClamPizza is preparing");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyleClamPizza is baking");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyleClamPizza is cutting");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyleClamPizza is boxing");
    }
}
