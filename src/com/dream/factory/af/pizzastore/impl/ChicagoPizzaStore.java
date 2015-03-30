package com.dream.factory.af.pizzastore.impl;

import com.dream.factory.af.ingredientfactory.PizzaIngredientFactory;
import com.dream.factory.af.ingredientfactory.impl.ChicagoPizzaIngredientFactory;
import com.dream.factory.af.pizza.Pizza;
import com.dream.factory.af.pizza.impl.CheesePizza;
import com.dream.factory.af.pizza.impl.ClamPizza;
import com.dream.factory.af.pizza.impl.PepperoniPizza;
import com.dream.factory.af.pizza.impl.VeggiePizza;
import com.dream.factory.af.pizzastore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
