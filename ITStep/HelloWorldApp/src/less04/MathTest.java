package less04;

import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		int a, b, c;
		double x1 = 0, x2 = 0, discr;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first digital: ");
		a = sc.nextInt();
		System.out.print("Input second digital: ");
		b = sc.nextInt();
		System.out.print("Input third digital: ");
		c = sc.nextInt();
		discr = b * b - 4 * a * c;
		System.out.println(discr);
		if (discr > 0) {
			x1 = ((-b + Math.sqrt(discr)) / (2 * a));
			x2 = ((-b - Math.sqrt(discr)) / (2 * a));
			System.out.println("Roots of the equation\n\t1.x1 = " + x1 + "\n\t2.x2 = " + x2);
		} else if (discr == 0) {
			x1 = (-(double) b / 2 * a);
			System.out.println("One root of the equation\n\t x = " + x1);
		} else {
			System.out.println("No roots");
		}

		sc.close();
	}

}
