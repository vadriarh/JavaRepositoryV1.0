package com.homework5;

public class List2 {

	public static void method1(int a, int b) {
		System.out.println("Result:" + a + "/" + b + " = " + a / b + "(" + a % b + ")");
	}

	public static void method2(int x) {
		System.out.println("Result:" + (x / 10 + x % 10));
	}

	public static void method3(double x) {
		if (x - (int) x >= 0.5) {
			System.out.println("Result: " + ((int) x + 1));
		} else {
			System.out.println("Result: " + (int) x);
		}
	}

	public static void method4(int x) {
		System.out.println("Result : " + (x / 100 + (x / 10) % 10 + ((x % 10) % 10)));
	}

	public static void method5() {
		int key, val;
		System.out.print("Input value K: ");
		val = Utils.inputVal(-10000, 10000);
		if (val <= 5) {
			if (val > 0) {
				key = 2;
			} else {
				key = 1;
			}
		} else {
			if (val <= 10) {
				key = 3;
			} else {
				key = 4;
			}
		}
		switch (key) {
		case 1:
			System.out.println("The value belongs to the interval (-10000,0]");
			break;
		case 2:
			System.out.println("The value belongs to the interval (0,5]");
			break;
		case 3:
			System.out.println("The value belongs to the interval (5,10]");
			break;
		case 4:
			System.out.println("The value belongs to the interval (10,1000)");
			break;
		}
	}

	public static void method6() {
		for (int i = 0; i < 25; i++) {
			System.out.println(i + " ");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}

	public static void method7(int a, int b, int c) {
		double discr, x1, x2;
		discr = b * b - 4 * a * c;
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
	}
}
