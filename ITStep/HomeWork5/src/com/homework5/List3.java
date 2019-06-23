package com.homework5;

public class List3 {
	public static void methodOne() {
		int val = 1000;
		while (val < 10000) {
			System.out.print(val + " ");
			val += 3;
		}
	}

	public static void methodTwo() {
		int val = 1;
		for (int i = 0; i < 55; i++) {
			while (true) {
				if ((val % 2) != 0) {
					System.out.print(val + " ");
					val++;
					break;
				}
				val++;
			}
		}
	}

	public static void methodThree() {
		int val = 90;
		while (val > 0) {
			System.out.print(val + " ");
			val -= 5;
		}
	}

	public static void methodFour() {
		int val = 2;
		for (int i = 0; i < 20; i++) {
			System.out.print(val + " ");
			val *= 2;
		}
	}

	public static void methodFive(int val) {
		int valDiv = 1;
		while (valDiv <= (val / 2)) {
			if (val % valDiv == 0) {
				System.out.print(valDiv + " ");
			}
			valDiv++;
		}
	}

	public static void methodSix() {
		int a = 0, b = 1, c = 0;
		for (int i = 0; i < 11; i++) {
			System.out.print(b + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

	public static void methodSeven() {
		int count = 0, bound = 50000, digital = 2;
		for (int val = 0; val < bound; val++) {
			if (val % 10 == digital) {
				// System.out.print(val+" ");
				count++;
			}
		}
		System.out.println(count);
	}
}
