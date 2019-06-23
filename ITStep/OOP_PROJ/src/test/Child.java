package test;

public class Child extends Person {
	String toys[];
	String school;
	String namesOfChildrenInFamily[];
	int childrenInFamily;

	String address;

	public void printInfo() {
		super.printInfo();
		System.out.println("School: " + school);
		System.out.println("Address: " + address);
		System.out.println("Children In Family: " + childrenInFamily);
		System.out.println("Names Of Children In Family: ");

		System.out.println("Children In Family: " + childrenInFamily);

	}

}
