package com.muxter.FactoryPattern.FactoryMethod;

/**
 * Created by matao on 08/02/2017.
 */
public class NewYorkPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NewYorkStyleCheesePizza();
                break;
            case "clam":
                pizza = new NewYorkStyleClamPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
