package com.dream.strategy_pattern.duck;

import com.dream.strategy_pattern.fly.impl.FlyNoWay;
import com.dream.strategy_pattern.quack.impl.Quack;

/**
 * HeadFirstDesignPatterns
 * Created by Mr Su on 2015-3-26 13:51.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
