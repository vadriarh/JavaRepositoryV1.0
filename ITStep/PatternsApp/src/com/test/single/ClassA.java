package com.test.single;

public class ClassA {
	private static ClassA instance;
	private int x;
	static {
		instance=new ClassA();
	}
	
	private ClassA() {
		x=(int)(Math.random()*101);
	}
	

	public static ClassA getInstance() {
		return instance;
	}
	
	public int getX() {
		return x;
	}
}
