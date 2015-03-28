package com.dream.decorator;

import com.dream.decorator.coffee.Beverage;
import com.dream.decorator.coffee.DarkRoast;
import com.dream.decorator.coffee.Espresso;
import com.dream.decorator.coffee.HouseBlend;
import com.dream.decorator.condiment.Mocha;
import com.dream.decorator.condiment.Soy;
import com.dream.decorator.condiment.Whip;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 17:42
 */
public class StarbuzzCoffee {

    public static final String DOLLAR = " $";

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + DOLLAR + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + DOLLAR + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + DOLLAR + houseBlend.cost());
    }
}
