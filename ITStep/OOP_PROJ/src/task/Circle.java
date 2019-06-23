package task;

public class Circle extends Shape {
	double radius = -1;

	double findArea() {
		s = Math.PI * radius * radius;
		check(messageS + s);
		return s;
	}

	double findP() {
		p = 0;
		check(messageP + p);
		return p;
	}

	@Override
	boolean initializationOFShape() {
		condition = radius > 0;
		nameOfShape = "Circle";
		return condition;
	}
}
