package com.dream.factory.af.pizza.impl;

import com.dream.factory.af.ingredientfactory.PizzaIngredientFactory;
import com.dream.factory.af.pizza.Pizza;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-30 15:08
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
