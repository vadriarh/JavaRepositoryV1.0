package com.test.factory.pizza;

public class PepperoniPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("Add pepperoni.");
		
	}

	@Override
	public void bake() {
		System.out.println("Baked 15 minutes.");
		
	}

}
