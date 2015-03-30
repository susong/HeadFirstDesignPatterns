package com.dream.factory.fm.pizzastore;

import com.dream.factory.fm.pizza.Pizza;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-30 10:39
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
