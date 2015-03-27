package com.dream.strategy_pattern.duck;

import com.dream.strategy_pattern.fly.impl.FlyWithWings;
import com.dream.strategy_pattern.quack.impl.Quack;

/**
 * HeadFirstDesignPatterns
 * Created by Mr Su on 2015-3-26 11:32.
 */
public class MallardDuck extends Duck {
    
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
