package com.dream.strategy_pattern.fly.impl;

import com.dream.strategy_pattern.fly.FlyBehavior;

/**
 * HeadFirstDesignPatterns
 * Created by Mr Su on 2015-3-26 13:54.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
