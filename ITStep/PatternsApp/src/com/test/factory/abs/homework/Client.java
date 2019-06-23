package com.test.factory.abs.homework;

public class Client {

	public static void main(String[] args) {
		FurnitureFactory factory = new GothicFurnitureFactory();
		Furniture sofa = factory.createSofa();
		sofa.info();
		sofa.hasLegs();
		sofa.material();
		sofa.style();
		System.out.println();
		Furniture chair = factory.createChair();
		chair.info();
		chair.hasLegs();
		chair.material();
		chair.style();
	}

}
