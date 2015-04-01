package com.dream.templatemethod.barista;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015/4/1 0001 20:37.
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
