package com.test.factory.pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Add cheese.");
		
	}

	@Override
	public void bake() {
		System.out.println("Baked 10 minute");
		
	}

}
