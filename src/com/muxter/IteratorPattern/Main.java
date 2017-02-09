package com.muxter.IteratorPattern;

/**
 * Created by matao on 09/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new BreakfastMenu(), new DinnerMenu());
        waitress.printMenu();
    }
}
