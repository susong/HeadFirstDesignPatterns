package com.dream.adapter;

import java.util.Random;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015/4/1 0001 0:35.
 */
public class DuckAdapter implements Turkey {

    Duck duck;
    Random random;

    public DuckAdapter(Duck duck){
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if(random.nextInt(5)==0) {
            duck.fly();
        }
    }
}
