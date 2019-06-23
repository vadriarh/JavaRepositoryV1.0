package com.homework7.oop.task1;

public class PhoneFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone ph1 = new Phone();
		Phone ph2 = new Phone();
		Phone ph3 = new Phone();
		ph1.brand = "HTC";
		ph1.model = "Radar";
		ph1.color = "Gray";
		ph1.cost = 250;
		ph1.displaySize = 3.8;
		ph1.displayType = "SLCD";
		ph1.operationSystem = "Windows Phone";
		ph1.operationSystemVersion = "7.8";
		ph1.weight = 137;

		ph2.brand = "Xiaomi";
		ph2.model = "Redmi";
		ph2.color = "4X";
		ph2.cost = 400;
		ph2.displaySize = 5;
		ph2.displayType = "IPS";
		ph2.operationSystem = "Android";
		ph2.operationSystemVersion = "6.0 Marshmallow";
		ph2.weight = 150;

		ph3.brand = "CAT";
		ph3.model = "S61";
		ph3.color = "Black";
		ph3.cost = 1718;
		ph3.displaySize = 5.2;
		ph3.displayType = "IPS";
		ph3.operationSystem = "Android";
		ph3.operationSystemVersion = "8.0 Oreo";
		ph3.weight = 250;
		ph3.protect = "Gorilla Glass v5";
		System.out.println(ph1);
		System.out.println();
		System.out.println(ph2);
		System.out.println();
		System.out.println(ph3);
		System.out.println();
	}

}
