package com.dream.decorator.coffee;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 17:08
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = this.getClass().getSimpleName();
        this.size = Beverage.GRANDE;
    }

    public DarkRoast(int size) {
        description = this.getClass().getSimpleName();
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
