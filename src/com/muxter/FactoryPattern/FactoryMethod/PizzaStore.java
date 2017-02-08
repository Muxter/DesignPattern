package com.muxter.FactoryPattern.FactoryMethod;

/**
 * Created by matao on 08/02/2017.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
