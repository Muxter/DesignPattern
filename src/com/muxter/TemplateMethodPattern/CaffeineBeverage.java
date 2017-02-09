package com.muxter.TemplateMethodPattern;

/**
 * Created by matao on 09/02/2017.
 */
public abstract class CaffeineBeverage {
    /**
     * 模板方法
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();

    /**
     * 钩子方法，子类可以根据需要进行覆盖来改变模板方法行为
     */
    boolean customerWantsCondiments() {
        return true;
    }
}