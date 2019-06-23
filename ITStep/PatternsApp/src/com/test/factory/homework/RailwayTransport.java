package com.test.factory.homework;

public abstract class RailwayTransport implements Transport {

	@Override
	public void deliver() {
		System.out.println(" by railway.");
	}

	public static RailwayTransport createTransport(int code) {
		if (code == 0) {
			return new Train();
		}
		return null;
	}
}
