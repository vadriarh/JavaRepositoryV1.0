package com.zoo;

public class Tiger extends Cat {

	int numOfLines;

	@Override
	public String toString() {
		System.out.println("NOT SUPPORTED");
		return null;
	}

	@Override
	public void eat() {
		System.out.println("Tiger -> eat()");
		
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
