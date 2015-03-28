package com.dream.decorator.condiment;

import com.dream.decorator.coffee.Beverage;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 17:19
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "," + this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
