package com.muxter.DecoratorPattern;

/**
 * Created by matao on 07/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("Beverage: " + beverage.getDescription() + ", Cost: " + beverage.cost());

        beverage = new Milk(beverage);
        System.out.println("Beverage: " + beverage.getDescription() + ", Cost: " + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println("Beverage: " + beverage.getDescription() + ", Cost: " + beverage.cost());
    }
}
