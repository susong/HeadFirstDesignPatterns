package com.dream.factory.af.ingredientfactory.impl;

import com.dream.factory.af.ingredient.*;
import com.dream.factory.af.ingredient.impl.*;
import com.dream.factory.af.ingredientfactory.PizzaIngredientFactory;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-30 14:07
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies={new Spinach(),new Eggplant(),new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
