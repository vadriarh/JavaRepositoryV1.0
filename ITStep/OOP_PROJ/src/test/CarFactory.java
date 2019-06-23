package test;

public class CarFactory {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "White";
		c1.cost = 1500000;
		c1.model = "Corolla";
		c1.name = "Toyota";
		c1.vEngine = 4.9;

		Car c2 = new Car();
		c2.color = "Red";
		c2.cost = 2500000;
		c2.model = "Prado";
		c2.name = "Land Cruiser";
		c2.vEngine = 5.8;

		Car c3 = new Car();
		c3.color = "Metalic";
		c3.cost = 8000000;
		c3.model = "X7";
		c3.name = "BMW";
		c3.vEngine = 7.1;

		Person p2 = new Person();
		p2.age = 55;
		p2.iq = 30;
		p2.lastName = "Tyson";
		p2.name = "Mike";

		c3.owner = p2;

		Car cars[] = { c1, c2, c3 };
		for (Car car : cars) {
			System.out.println("Name is " + car.name);
			System.out.println("Model is " + car.model);
			System.out.println("Color is " + car.color);
			System.out.println("Engine is " + car.vEngine);
			System.out.println("Cost is " + car.cost);
			System.out.print("Owner info: ");
			Test.printPersonInfo(car.owner);
			System.out.println("=====================");
		}
	}

}
