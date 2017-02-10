package com.muxter.StatePattern;

/**
 * Created by matao on 10/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(2);
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n-------------");
        machine.insertQuarter();
        machine.ejectQuarter();

        System.out.println("\n-------------");
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println("\n-------------");
        machine.insertQuarter();
        machine.turnCrank();
    }
}
