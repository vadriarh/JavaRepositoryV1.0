package com.test.factory.car;

public class CarFactory {
	public static Car buildCar(Person p) {
		if (p.getClass() == RichMan.class) {
			return new LuxuryCar();
		} else if (p.getClass() == MetroMan.class) {
			return new SmallCar();
		} else if (p.getClass() == FamilyMan.class) {
			return new SedanCar();
		} else {
			return null;
		}
	}
}
