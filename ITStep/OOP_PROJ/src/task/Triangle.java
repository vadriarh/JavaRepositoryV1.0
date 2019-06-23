package task;

public class Triangle extends Shape {
	double a = -1, b = -1, c = -1;

	double findArea() {
		double semiPer = (a + b + c) / 2;
		s = Math.sqrt(semiPer * (semiPer - a) * (semiPer - b) * (semiPer - c));
		check(messageS + s);
		return s;
	}

	double findP() {
		p = a + b + c;
		check(messageP + p);
		return p;
	}

	@Override
	boolean initializationOFShape() {
		if ((a + b > c && a + c > b && b + c > a) && (a > 0 && b > 0 && c > 0)) {

			condition = true;

			if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)
					|| Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
				nameOfShape = "Triangle (Square)";
				return condition;
			}

			if (a == b || a == c || b == c) {
				nameOfShape = "Triangle (Isosceles)";
				return condition;
			}

			if (a == b && a == c && b == c) {
				nameOfShape = "Triangle (Equilateral)";
				return condition;
			}
			nameOfShape = "Triangle (Usual)";
		}
		return condition;
	}

}
