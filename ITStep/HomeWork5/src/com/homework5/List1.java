package com.homework5;

import static com.homework5.List2.*;
import static com.homework5.Utils.*;

public class List1 {

	private static int a, b, c, x, max, age;
	static double xDouble;

	public static void Task1() {
		System.out.print("Input number A: ");
		a = inputVal();
		System.out.print("Input number B: ");
		b = inputVal();
		method1(a, b);
	}

	public static void Task2() {
		System.out.print("Input value X: ");
		x = inputVal(10, 99);
		method2(x);
	}

	public static void Task3() {
		System.out.print("Input value X: ");
		xDouble = inputDoubleVal();
		method3(xDouble);
	}

	public static void Task4() {
		System.out.print("Input value X: ");
		x = inputVal(10000, 99999);
		System.out.println("Result : " + (x / 10000 + (x / 1000) % 10 + ((x / 100) % 100) % 10
				+ (((x / 10) % 1000) % 100) % 10 + (((x % 10000) % 1000) % 100) % 10));
	}

	public static void Task5() {
		System.out.print("Input number A: ");
		a = inputVal();
		System.out.print("Input number B: ");
		b = inputVal();
		System.out.print("Input number C: ");
		c = inputVal();
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (max > c) {
			System.out.println("Max Val = " + max);
		} else {
			System.out.println("Max Val = " + c);
		}
	}

	public static void Task6() {
		System.out.print("Input your age: ");
		age = inputVal(1, 120);
		if (age >= 18 && age <= 27) {
			System.out.println("You are subject to military service or you can serve under the contract.");
		} else if (age >= 28 && age <= 59) {
			System.out.println("You can serve as a contract.");
		} else {
			System.out.println("You are at the age of non-appeal.");
		}
	}

	public static void Task7() {
		System.out.print("Input your age: ");
		return;
	}

}