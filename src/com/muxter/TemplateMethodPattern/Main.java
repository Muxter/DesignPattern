package com.muxter.TemplateMethodPattern;

import java.util.Arrays;

/**
 * Created by matao on 09/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        CaffeineBeverage beverage = new Coffee();
        beverage.prepareRecipe();
        System.out.println("-----------------------------------");
        beverage = new Tea();
        beverage.prepareRecipe();
        Arrays.sort();
    }
}
