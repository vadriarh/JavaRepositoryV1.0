package com.homework7.oop.task1;

public class Car {
	String brand;
	String model;
	String color;
	double weight;
	double accelerate;
	double maxSpeed;
	int passengers;

	@Override
	public String toString() {
		String message = "Car: " + brand + " " + model + ".\nColor: " + color + ".\nWeight: " + weight
				+ ".\nHis accelerate: " + accelerate + ".\nMax speed: " + maxSpeed + ".\nPlaces for passengers: "
				+ passengers;

		return message;
	}

}
