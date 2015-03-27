package com.dream.strategy_pattern.quack.impl;

import com.dream.strategy_pattern.quack.QuackBehavior;

/**
 * HeadFirstDesignPatterns
 * Created by Mr Su on 2015-3-26 11:25.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
