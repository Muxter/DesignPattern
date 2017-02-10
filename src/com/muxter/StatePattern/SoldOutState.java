package com.muxter.StatePattern;

/**
 * Created by matao on 10/02/2017.
 */
public class SoldOutState implements State{

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("It is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("It is sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("It is sold out");
    }

    @Override
    public void dispense() {
        System.out.println("It is sold out");
    }
}
