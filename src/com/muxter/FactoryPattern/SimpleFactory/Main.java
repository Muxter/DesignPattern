package com.muxter.FactoryPattern.SimpleFactory;

/**
 * Created by matao on 08/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("cheese");

        store.orderPizza("clam");
    }
}
