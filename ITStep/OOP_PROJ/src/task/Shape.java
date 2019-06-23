package task;

public class Shape {
	double p;
	double s;
	boolean condition;
	String messageS = "Area = ";
	String messageP = "P = ";
	String messageAlert = "Can't create this ";
	String nameOfShape = "Shape";

	double findArea() {
		System.out.println("Can't find area");
		return 0;
	}

	double findP() {
		System.out.println("Can't find P");
		return 0;
	}

	void check(String str) {
		if (initializationOFShape()) {
			System.out.println(str);
		} else {
			System.out.println(messageAlert + nameOfShape);

		}
	}

	boolean initializationOFShape() {
		return false;
	}

}
