package com.test;

public class Task {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i != 10) {
				System.out.print(i + ", ");
			} else {
				System.out.println(i + ".");
			}
		}
		System.out.println("Task #1");
		for (int i = 1; i <= 50; i++) {
			if (i != 50) {
				System.out.print((i * i) + ", ");
			} else {
				System.out.println((i * i) + ".");
			}
		}
		System.out.println("Task #2");
		for (int i = 1; i <= 150; i++) {
			if (i != 150) {
				System.out.print((i * 5) + ", ");
			} else {
				System.out.println((i * 5) + ".");
			}
		}
		System.out.println("Task #3");
		for (int i = 1; i <= 25; i++) {
			if (i != 25) {
				if (i % 2 == 0) {
					System.out.print(i + ", ");
				} else {
					System.out.print((-1) * i + ", ");
				}
			} else {
				if (i % 2 == 0) {
					System.out.print(i + ".");
				} else {
					System.out.print((-1) * i + ".");
				}
			}
		}
		System.out.println();
		boolean flag = false;
		System.out.println("Task #3 ver.2");
		for (int i = 1; i <= 25; i++) {
			if (i != 25) {
				if (flag) {
					System.out.print(i + ", ");
					flag = !flag;
				} else {
					System.out.print((-1) * i + ", ");
					flag = !flag;
				}
			} else {
				if (flag) {
					System.out.print(i + ".");
					flag = !flag;
				} else {
					System.out.print((-1) * i + ".");
					flag = !flag;
				}
			}
		}

		System.out.println();
		System.out.println("Task #4");
		for (int i = 1, z = 500; i <= 500; i++, z--) {
			if (i != 500) {
				if (i % 2 == 0) {
					System.out.print(z + ", ");
				} else {
					System.out.print((-1) * z + ", ");
				}
			} else {
				if (i % 2 == 0) {
					System.out.print(z + ".");
				} else {
					System.out.print((-1) * z + ".");
				}
			}
		}
		System.out.println();

		System.out.println("Task #5");
		for (int i = 1; i <= 20; i++) {
			if (i != 20) {
				System.out.print((int) (Math.random() * 101) + ", ");
			} else {
				System.out.println((int) (Math.random() * 101) + ".");
			}
		}
		System.out.println("Task #6");
		for (int i = 1; i <= 20; i++) {
			if (i % 4 == 0) {
				System.out.print((i / 2) + ", ");
			} else {
				System.out.print((i / 2) + ".");
			}
		}
	}

}
