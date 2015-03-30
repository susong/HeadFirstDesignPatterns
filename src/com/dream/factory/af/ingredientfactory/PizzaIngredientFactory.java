package com.dream.factory.af.ingredientfactory;

import com.dream.factory.af.ingredient.*;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-30 11:28
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
