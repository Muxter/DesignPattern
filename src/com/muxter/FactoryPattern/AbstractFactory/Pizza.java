package com.muxter.FactoryPattern.AbstractFactory;

/**
 * Created by matao on 08/02/2017.
 */
public abstract class Pizza {
    protected Cheese cheese;
    protected Clam clam;

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
