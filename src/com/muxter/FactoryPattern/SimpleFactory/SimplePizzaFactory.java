package com.muxter.FactoryPattern.SimpleFactory;

/**
 * Created by matao on 08/02/2017.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
