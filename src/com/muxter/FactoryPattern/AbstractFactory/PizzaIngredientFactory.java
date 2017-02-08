package com.muxter.FactoryPattern.AbstractFactory;

/**
 * Created by matao on 08/02/2017.
 */
public abstract class PizzaIngredientFactory {
    public abstract Cheese createCheese();

    public abstract Clam createClam();
}
