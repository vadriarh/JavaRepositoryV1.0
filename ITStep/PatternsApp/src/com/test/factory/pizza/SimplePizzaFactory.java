package com.test.factory.pizza;

public class SimplePizzaFactory {

	public Pizza createPizza(Class clas) {
		String nameClass = clas.getName().trim();
		nameClass=nameClass.substring(nameClass.lastIndexOf(".")+1);
		switch (nameClass) {
		case "CheesePizza":
			return new CheesePizza();
		case "VegglePizza":
			return new VegglePizza();
		case "PepperoniPizza":
			return new PepperoniPizza();
		default:
			System.out.println("Unknown Pizza");
			return null;
		}
	}
}
