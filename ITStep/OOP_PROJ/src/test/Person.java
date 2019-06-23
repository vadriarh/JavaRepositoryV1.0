package test;

public class Person {
	int iq;
	int age;
	String name;
	String lastName;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int iq, int age, String name, String lastName) {
		super();
		this.iq = iq;
		this.age = age;
		this.name = name;
		this.lastName = lastName;
	}

	char gender;
	Person relatives[];

	public void sayHello() {
		System.out.println("Person -> sayHello()");
	}

	public void dance() {
		System.out.println("Person -> sayHello()");
	}

	public void printInfo() {
		System.out.println("Person info: " + name + " " + lastName);
		System.out.println("Name: " + name);
		System.out.println("Last name:" + lastName);
		System.out.println("Age: " + age);
		System.out.println("IQ: " + iq);
		System.out.println("Gender: " + gender);
	}
}
