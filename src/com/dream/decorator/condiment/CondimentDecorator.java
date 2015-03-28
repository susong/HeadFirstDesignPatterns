package com.dream.decorator.condiment;

import com.dream.decorator.coffee.Beverage;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 17:04
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();
}
