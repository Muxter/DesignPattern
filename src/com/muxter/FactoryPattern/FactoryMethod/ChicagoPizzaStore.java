package com.muxter.FactoryPattern.FactoryMethod;

/**
 * Created by matao on 08/02/2017.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "clam":
                pizza = new ChicagoStyleClamPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
