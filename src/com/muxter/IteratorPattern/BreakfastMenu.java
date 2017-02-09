package com.muxter.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by matao on 09/02/2017.
 */
public class BreakfastMenu extends Menu {
    private List<MenuItem> menuItems;

    public BreakfastMenu() {
        this.menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancakes with fried eggs", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }


    @Override
    public Iterator<MenuItem> iterator() {
        return menuItems.iterator();
    }
}
