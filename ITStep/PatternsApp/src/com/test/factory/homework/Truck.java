package com.test.factory.homework;

public class Truck extends RoadTransport {

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.print("Deliver by truck ");
		super.deliver();
	}
}