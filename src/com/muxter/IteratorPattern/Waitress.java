package com.muxter.IteratorPattern;

import java.util.Iterator;

/**
 * Created by matao on 09/02/2017.
 */
public class Waitress {
    private BreakfastMenu breakfastMenu;
    private DinnerMenu dinnerMenu;

    public Waitress(BreakfastMenu breakfastMenu, DinnerMenu dinnerMenu) {
        this.breakfastMenu = breakfastMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> breakfastIterator = breakfastMenu.iterator();
        System.out.println("MENU");
        System.out.println("-----------------");
        System.out.println("BREAKFAST");
        printMenu(breakfastIterator);

        Iterator<MenuItem> dinnerIterator = dinnerMenu.iterator();
        System.out.println("\nDINNER");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
