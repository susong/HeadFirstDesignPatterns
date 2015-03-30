package com.dream.decorator.condiment;

import com.dream.decorator.coffee.Beverage;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 17:12
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public int getSize(){
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "," + this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            cost += 0.15;
        } else if (getSize() == Beverage.GRANDE) {
            cost += 0.20;
        } else if (getSize() == Beverage.VENTI) {
            cost += 0.25;
        }
        return cost;
    }
}
