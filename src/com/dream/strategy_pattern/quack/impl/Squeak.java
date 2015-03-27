package com.dream.strategy_pattern.quack.impl;

import com.dream.strategy_pattern.quack.QuackBehavior;

/**
 * HeadFirstDesignPatterns
 * Created by Mr Su on 2015-3-26 11:27.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
