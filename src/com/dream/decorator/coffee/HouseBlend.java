package com.dream.decorator.coffee;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 17:06
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = this.getClass().getSimpleName();
        this.size = Beverage.GRANDE;
    }

    public HouseBlend(int size) {
        description = this.getClass().getSimpleName();
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
