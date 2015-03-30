package com.dream.factory.fm.pizzastore.impl;

import com.dream.factory.fm.pizza.Pizza;
import com.dream.factory.fm.pizza.impl.ChicagoStyleCheesePizza;
import com.dream.factory.fm.pizza.impl.ChicagoStyleClamPizza;
import com.dream.factory.fm.pizza.impl.ChicagoStylePepperoniPizza;
import com.dream.factory.fm.pizza.impl.ChicagoStyleVeggiePizza;
import com.dream.factory.fm.pizzastore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
