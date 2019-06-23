package task;

public class Client {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 1;
		c1.findArea();
		c1.findP();

		System.out.println();

		Triangle tr1 = new Triangle();
		tr1.a = 3;
		tr1.b = 4;
		tr1.c = 5;
		tr1.findArea();
		tr1.findP();

		System.out.println();
		System.out.println(tr1);

		Rectangle r1 = new Rectangle();
		r1.a = 2;
		r1.b = 4;
		r1.findArea();
		r1.findP();
		System.out.println(Math.pow(2, 3));
	}

}
