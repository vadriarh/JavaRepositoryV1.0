package com.test.factory.homework;

public abstract class SeaTransport implements Transport {

	@Override
	public void deliver() {
		System.out.println(" by sea.");
	}

	public static SeaTransport createTransport(int code) {
		if (code == 0) {
			return new Ship();
		}
		return null;
	}

}
