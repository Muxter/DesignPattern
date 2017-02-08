package com.muxter.FactoryPattern.FactoryMethod;

/**
 * Created by matao on 08/02/2017.
 */
public class NewYorkStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NewYorkStyleClamPizza is preparing");
    }

    @Override
    public void bake() {
        System.out.println("NewYorkStyleClamPizza is baking");
    }

    @Override
    public void cut() {
        System.out.println("NewYorkStyleClamPizza is cutting");
    }

    @Override
    public void box() {
        System.out.println("NewYorkStyleClamPizza is boxing");
    }
}
