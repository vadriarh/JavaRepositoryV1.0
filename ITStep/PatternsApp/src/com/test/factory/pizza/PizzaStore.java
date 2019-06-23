package com.test.factory.pizza;

public class PizzaStore {

	public static void main(String[] args) {
		SimplePizzaFactory pizzeria1= new SimplePizzaFactory();
		Pizza p1=pizzeria1.createPizza(PepperoniPizza.class);
		p1.prepare();
		p1.bake();
		p1.cut();
		p1.box();

	}

}
