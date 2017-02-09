package com.muxter.TemplateMethodPattern;

/**
 * Created by matao on 09/02/2017.
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    boolean customerWantsCondiments() {
        return false;
    }
}
