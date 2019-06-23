package com.test.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape s= factory.getShape(2);
		s.draw();

		Shape s2=factory.getShape("TRIANGLE");
		s2.draw();
	}

}
