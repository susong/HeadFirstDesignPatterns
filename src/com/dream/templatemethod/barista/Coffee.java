package com.dream.templatemethod.barista;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015/4/1 0001 20:38.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
