package com.test.factory.pizza;

public class VegglePizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("Add vegetables.");
		
	}

	@Override
	public void bake() {
		System.out.println("Baked 7 minutes");
		
	}

}
