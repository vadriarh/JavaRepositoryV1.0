package com.homework5;

import static com.homework5.Utils.*;
import static com.homework5.List1.*;
import static com.homework5.List2.*;
import static com.homework5.List3.*;

public class Menu {
	private static int task, a, b, c;

	public static void menu() {
		System.out.print("1.List 1.\n2.List 2.\n3.List 3.\n4.Play on Casino.\n5.Exit.\nSelect list: ");
		int list = inputVal(1, 5);
		switch (list) {
		case 1:
			menuList1();
			break;
		case 2:
			menuList2();
			break;
		case 3:
			menuList3();
			break;
		case 4:
			Casino.gameOnCasino();
			break;
		case 5:
			break;
		}
	}

	public static void menuList1() {
		System.out.print("Task 1-6 on List 1 and Task 7 - exit\nSelect task: ");
		task = inputVal(1, 7);
		switch (task) {
		case 1:
			Task1();
			break;
		case 2:
			Task2();
			break;
		case 3:
			Task3();
			break;
		case 4:
			Task4();
			break;
		case 5:
			Task5();
			break;
		case 6:
			Task6();
			break;
		case 7:
			System.out.println("GoodBye.");
			return;
		}
	}

	public static void menuList2() {
		System.out.print("Task 5-7 on List 2 and Task 8 - exit\nSelect task: ");
		task = inputVal(1, 7);
		switch (task) {
		case 5:
			method5();
			break;
		case 6:
			method6();
			break;
		case 7:
			System.out.print("Input number A: ");
			a = inputVal();
			System.out.print("Input number B: ");
			b = inputVal();
			System.out.print("Input number C: ");
			c = inputVal();
			method7(a, b, c);
			break;
		case 8:
			System.out.println("GoodBye.");
			break;
		}
	}

	public static void menuList3() {
		System.out.print("Task 1-7 on List 3 and Task 8 - exit\nSelect task: ");
		task = inputVal(1, 7);
		switch (task) {
		case 1:
			methodOne();
			break;
		case 2:
			methodTwo();
			break;
		case 3:
			methodThree();
			break;
		case 4:
			methodFour();
			break;
		case 5:
			System.out.print("Input value: ");
			a = inputVal();
			methodFive(a);
			break;
		case 6:
			methodSix();
			break;
		case 7:
			methodSeven();
			break;
		case 8:
			System.out.println("GoodBye.");
			break;
		}
	}
}