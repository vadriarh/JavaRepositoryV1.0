package com.test.factory.homework;

public abstract class AirTransport implements Transport{

	@Override
	public void deliver() {
		System.out.println(" by air.");		
	}
	
	public static AirTransport createTransport(int code) {
		if(code==0) {
			return new Plane();
		}
		return null;
	}
}
