package com.dream.decorator.coffee;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 17:01
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public static int TALL = 1;
    public static int GRANDE = 2;
    public static int VENTI = 3;

    protected int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
