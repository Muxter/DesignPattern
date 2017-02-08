package com.muxter.FactoryPattern.AbstractFactory;

/**
 * Created by matao on 08/02/2017.
 */
public class NewYorkPizzaIngredientFactory extends PizzaIngredientFactory {
    
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
