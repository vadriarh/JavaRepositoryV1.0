package com.test.factory.car;

public class AutoHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new FamilyMan();
		p1.setCash(700);
		Car c1 = CarFactory.buildCar(p1);
		orderCar(c1, p1);
		c1.drive();
	}

	static void orderCar(Car c, Person p) {
		System.out.println(p.getClass());
		System.out.println(c.getClass());
		if (c.price <= p.getCash()) {
			System.out.println("Good deal.");
		} else {
			System.out.println("No deal.");
		}
	}

}
