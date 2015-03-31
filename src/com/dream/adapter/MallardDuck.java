package com.dream.adapter;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015/4/1 0001 0:25.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
