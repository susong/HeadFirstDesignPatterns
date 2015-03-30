package com.dream.factory.fm;

import com.dream.factory.fm.pizza.Pizza;
import com.dream.factory.fm.pizzastore.PizzaStore;
import com.dream.factory.fm.pizzastore.impl.NYPizzaStore;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-30 10:51
 */
public class PizzaTestDrive {


    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName());
    }
}
