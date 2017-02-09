package com.muxter.CompositePattern;

/**
 * Created by matao on 09/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert of course!");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        allMenus.add(breakfastMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(dessertMenu);

        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with souce", true, 3.89));
        dinnerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple pie", "Apple pie with apple", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
