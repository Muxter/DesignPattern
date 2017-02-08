package com.muxter.FactoryPattern.AbstractFactory;

/**
 * Created by matao on 08/02/2017.
 */
public class CheesePizza extends Pizza{

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("CheesePizza preparation starts");
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
        System.out.println("Added" );
        System.out.println("CheesePizza preparation ends");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza is baking");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza is cutting");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza is boxing");
    }
}
