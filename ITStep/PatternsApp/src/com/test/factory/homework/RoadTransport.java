package com.test.factory.homework;

public abstract class RoadTransport implements Transport {

	@Override
	public void deliver() {
		System.out.println("by road.");
	}

	public static RoadTransport createTransport(int code) {
		if (code == 0) {
			return new Truck();
		}
		return null;
	}
}
