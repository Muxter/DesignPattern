package com.muxter.IteratorPattern;

import java.util.Iterator;

/**
 * Created by matao on 09/02/2017.
 */
public class DinnerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        ++position;
        return menuItem;
    }
}
