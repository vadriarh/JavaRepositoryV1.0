package com.test;

public class Utils {

	/**
	 * Print current date to the "standard" output stream (Console)
	 * 
	 * @author VADIM
	 * @since
	 *        <h1>2019/01/30
	 *        <h1>
	 * 
	 */
	public static void printDate() {
		System.out.println("Current Date is " + new java.util.Date());
	}

	/**
	 * 
	 * @return random value from 0 to 100
	 */
	public static int generateRandomValue() {
		return (generateRandomValue(100));
	}

	public static int generateRandomValue(int bound) {
		int x = (int) (Math.random() * (bound + 1));
		// System.out.println("Value was generated...");
		return x;
	}

	public static double addition(double a, double b) {
		return a + b;
	}

	public static double subtraction(double a, double b) {
		return a - b;
	}

	public static double multiplication(double a, double b) {
		return a * b;
	}

	public static double division(double a, double b) {
		return a / b;
	}

	public static void print(int i) {
		print(i + "");
	}

	public static void print(double d) {
		print(d + "");
	}

	public static void print(String s) {
		System.out.println(s);
	}

	public static int findMax(int number, int bound) {
		int max = 0;
		for (int i = 0; i < number; i++) {
			int val = generateRandomValue(bound);
			System.out.println((i + 1) + ".Value is generated: " + val);
			if (max < val) {
				max = val;
			}
			if (max == bound) {
				break;
			}
		}
		return max;
	}

	public static void fib(int num) {
		if (num <= 0) {
			throw new IllegalArgumentException("Wrong input!" + num);
		}
		int first = 0, second = 1, third = 0;

		for (int i = 0; i < num; i++) {
			System.out.print(second + " ");
			third = first + second;
			first = second;
			second = third;
		}
	}
}
