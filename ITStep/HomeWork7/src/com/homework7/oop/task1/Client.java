package com.homework7.oop.task1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
		p1.firstName = "Aleksey";
		p1.lastName = "Titov";
		p1.country = "Russia";
		p1.fullAge = 24;
		p1.haveFamily = false;
		p1.isMale = true;
		p1.nation = "Russian";
		p1.skinColor = "White";
		p2.firstName = "Mubarak";
		p2.lastName = "Ahijen";
		p2.country = "Kameroon";
		p2.fullAge = 36;
		p2.haveFamily = true;
		p2.isMale = true;
		p2.nation = "Kameroonian";
		p2.skinColor = "Black";
		p1.sayMyName();
		p2.sayMyName();
		System.out.println();

		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.brand = "Mercedes-Benz";
		c1.model = "F700";
		c1.color = "Green";
		c1.weight = 2567;
		c1.accelerate = 2.1;
		c1.maxSpeed = 278;
		c1.passengers = 6;
		c2.brand = "BMW";
		c2.model = "E30";
		c2.color = "Blue";
		c2.weight = 2160;
		c2.accelerate = 2.7;
		c2.maxSpeed = 230;
		c2.passengers = 4;
		c3.brand = "Audi";
		c3.model = "A3";
		c3.color = "Orange";
		c3.weight = 1300;
		c3.accelerate = 2.9;
		c3.maxSpeed = 223;
		c3.passengers = 4;

		System.out.println(c1);
		System.out.println();
		System.out.println(c2);
		System.out.println();
		System.out.println(c3);
		System.out.println();

	}

}
