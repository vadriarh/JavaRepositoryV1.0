package com.zoo;

public abstract class Cat extends Animal {
	double weight;
	boolean isWild;
	int numOfLives;

	@Override
	public String toString() {
		return "Cat [weight=" + weight + ", isWild=" + isWild + ", numOfLives=" + numOfLives + ", name=" + name
				+ ", age=" + age + "]";
	}



}
