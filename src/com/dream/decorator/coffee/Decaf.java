package com.dream.decorator.coffee;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 17:09
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = this.getClass().getSimpleName();
        this.size = Beverage.GRANDE;
    }

    public Decaf(int size) {
        description = this.getClass().getSimpleName();
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
