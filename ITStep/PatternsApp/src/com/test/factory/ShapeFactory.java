package com.test.factory;

public class ShapeFactory {
	
	/**
	 * Factory method
	 * @param code can be 1,2,3
	 * @return Shape
	 * @see Shape
	 */
	public Shape getShape(int code) {
		switch (code) {
		case 1:
			return new Circle();
		case 2:
			return new Square();
		case 3:

			return new Triangle();
		default:
			System.out.println("No such Code Shape! " + code);
			return null;
		}
	}
	
	public Shape getShape(String type) {
		if(type==null) {
			return null;
		}else if(type.trim().equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(type.trim().equalsIgnoreCase("Squre")) {
			return new Square();
		}else if(type.trim().equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		return null;
	}
}
