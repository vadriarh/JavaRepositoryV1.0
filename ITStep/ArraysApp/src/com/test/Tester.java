package com.test;

import static com.test.Utils.*;

public class Tester {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 232, 4, 5 };

		System.out.println("Size of array " + arr.length);
		System.out.println("First element = " + arr[0]);
		System.out.println("Last element = " + arr[arr.length - 1]);
		int x = (int) (Math.random() * 10);
		if (x < arr.length && x >= 0) {
			System.out.println("Random elem = " + arr[x]);
		} else {
			System.out.println("X is out of bounds: " + x);
		}

		arr[1] = (int) (Math.random() * 10);

		int arr2[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr2.length - 1] = 333;
		System.out.println();
		System.out.println("Size of array " + arr2.length);
		System.out.println("First element = " + arr2[0]);
		System.out.println("Last element = " + arr2[arr2.length - 1]);

		System.out.println("__________________");

		printArray(arr, true);
		System.out.println();
		printArray(arr, false);
		System.out.println();
		printArray(arr2, true);
		System.out.println();
		printArray(arr2, false);
		System.out.println();

	}
}
