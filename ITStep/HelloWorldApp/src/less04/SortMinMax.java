package less04;

import java.util.Scanner;

public class SortMinMax {
	public static void main(String[] args) {
		int a, b, c, min, max;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first digital: ");
		a = sc.nextInt();
		System.out.print("Input second digital: ");
		b = sc.nextInt();
		System.out.print("Input third digital: ");
		c = sc.nextInt();
		min = a;
		max = a;
		if (min > b) {
			min = b;
		} else {
			max = b;
		}
		if (min > c) {
			min = c;
		} else {
			max = c;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);

		sc.close();
	}
}
