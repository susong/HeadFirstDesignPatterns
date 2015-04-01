package com.dream.iterator;

import java.util.ArrayList;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015/4/1 0001 23:26.
 */
public class PancakeHouseIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position < menuItems.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position++;
        return menuItem;
    }
}
