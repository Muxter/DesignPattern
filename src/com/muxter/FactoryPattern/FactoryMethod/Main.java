package com.muxter.FactoryPattern.FactoryMethod;

/**
 * Created by matao on 08/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore store = new ChicagoPizzaStore();
        store.orderPizza("cheese");

        store = new NewYorkPizzaStore();
        store.orderPizza("clam");
    }
}
