package com.dream.factory.af.pizzastore.impl;

import com.dream.factory.af.ingredientfactory.PizzaIngredientFactory;
import com.dream.factory.af.ingredientfactory.impl.NYPizzaIngredientFactory;
import com.dream.factory.af.pizza.Pizza;
import com.dream.factory.af.pizza.impl.CheesePizza;
import com.dream.factory.af.pizza.impl.ClamPizza;
import com.dream.factory.af.pizza.impl.PepperoniPizza;
import com.dream.factory.af.pizza.impl.VeggiePizza;
import com.dream.factory.af.pizzastore.PizzaStore;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-30 15:14
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
