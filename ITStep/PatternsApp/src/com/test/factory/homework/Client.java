package com.test.factory.homework;

public class Client {

	public static void main(String[] args) {
		 
		Logistics food=new Logistics();
		Transport road1=food.planDelivery("road logistics",0);
		road1.deliver();
		 
	}
}
