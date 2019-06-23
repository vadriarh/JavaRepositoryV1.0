package less04;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		int a, b, c, choise;
		Scanner sc = new Scanner(System.in);
		System.out.println("Will you manually enter numbers or generate them?");
		System.out.println("\t1.Yes\n\t2.No");
		System.out.print("Your choise: ");
		choise = sc.nextInt();

		if (choise == 1) {
			System.out.print("Input first digital: ");
			a = sc.nextInt();
			System.out.print("Input second digital: ");
			b = sc.nextInt();
			System.out.print("Input third digital: ");
			c = sc.nextInt();

		} else {
			a = (int) (1 + Math.random() * 20);
			b = (int) (1 + Math.random() * 20);
			c = (int) (1 + Math.random() * 20);
			System.out.println("Was generated\n\ta = " + a + "\n\tb = " + b + "\n\tc = " + c);
		}

		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();

	}
}
