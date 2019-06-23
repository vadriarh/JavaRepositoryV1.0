package com.zoo;

public abstract class Animal implements Eatable,Cloneable,Comparable<Animal>{
	String name;
	int age;

	@Override // переопределение метода родительского класса. Обязательное условие будет
				// сигнатура метода.
	// Сама аннотация проверяет эту сигнатуру у родительского .
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}


}
