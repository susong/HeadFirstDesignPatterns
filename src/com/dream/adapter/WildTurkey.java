package com.dream.adapter;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015/4/1 0001 0:26.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
