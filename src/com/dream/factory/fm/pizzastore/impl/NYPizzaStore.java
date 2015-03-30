package com.dream.factory.fm.pizzastore.impl;

import com.dream.factory.fm.pizza.Pizza;
import com.dream.factory.fm.pizza.impl.NYStyleCheesePizza;
import com.dream.factory.fm.pizza.impl.NYStyleClamPizza;
import com.dream.factory.fm.pizza.impl.NYStylePepperoniPizza;
import com.dream.factory.fm.pizza.impl.NYStyleVeggiePizza;
import com.dream.factory.fm.pizzastore.PizzaStore;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-30 10:41
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
