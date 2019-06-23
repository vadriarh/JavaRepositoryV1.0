package task;

public class Rectangle extends Shape {
	double a = -1, b = -1;

	double findArea() {
		s = a * b;
		check(messageS + s);
		return s;
	}

	double findP() {
		p = 2 * (a + b);
		check(messageP + p);
		return p;
	}

	@Override
	boolean initializationOFShape() {
		condition = (a > 0 && b > 0);
		nameOfShape = "Rectangle";
		return condition;
	}

}
