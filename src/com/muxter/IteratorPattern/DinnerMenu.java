package com.muxter.IteratorPattern;

import java.util.Iterator;

/**
 * Created by matao on 09/02/2017.
 */
public class DinnerMenu extends Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("蛋炒饭", "鸡蛋、大米饭", false, 5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full");
        } else {
            menuItems[numberOfItems] = menuItem;
            ++numberOfItems;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
