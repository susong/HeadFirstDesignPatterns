package com.dream.decorator.coffee;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 17:05
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = this.getClass().getSimpleName();
    }


    @Override
    public double cost() {
        return 1.99;
    }
}
