package com.muxter.StatePattern;

/**
 * Created by matao on 10/02/2017.
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You cannot eject a quarter before you insert in");
    }

    @Override
    public void turnCrank() {
        System.out.println("You haven't insert a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You haven't insert a quarter");
    }
}
