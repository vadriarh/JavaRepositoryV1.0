package com.homework6;

import java.util.Scanner;

public class Client {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = new int[10];
		int arr2[] = new int[15];
		int find, findMin;
		// UtilsOld.doc

		arr = UtilsOld.generateAndPopulateArray(10, 100);
		arr2 = UtilsOld.generateAndPopulateArray(10, 100);
		System.out.print("arr1 = ");
		UtilsOld.printArray(arr, true);
		System.out.print("arr2 = ");
		UtilsOld.printArray(arr2, true);
		find = UtilsOld.find(arr, true);
		System.out.println("find max = " + find);
		findMin = UtilsOld.findMin(arr);
		System.out.println("find min = " + findMin);
		System.out.print("reverse arr1 ->");
		UtilsOld.printArray(UtilsOld.reverse(arr), true);
		System.out.print("mix arr1 ->");
		UtilsOld.printArray(UtilsOld.mixArray(arr), true);
		System.out.print("sorting arr1 ->");
		UtilsOld.printArray(UtilsOld.sortArray(arr), true);
		System.out.print("intersection arr1 ->");
		UtilsOld.printArray(UtilsOld.intersection(arr, arr2), true);
		System.out.print("union arr1 ->");
		UtilsOld.printArray(UtilsOld.union(arr, arr2), true);
		System.out.println();
		System.out.println();

		// UtilsExtra.txt
		int arr3[] = new int[10];
		System.out.println("Task #1");
		UtilsExtra.task1();
		System.out.println();
		System.out.println("Task #2");
		UtilsExtra.task2();
		System.out.println();
		System.out.println("Task #3");
		UtilsExtra.task3(arr3, -50, 50);
		UtilsOld.printArray(arr3, true);
		System.out.println();
		System.out.println("Task #4");
		UtilsExtra.task4(arr3);
		System.out.println();
		System.out.println("Task #5");
		UtilsOld.printArray(arr3, true);
		System.out.println("----->");
		UtilsOld.printArray(UtilsExtra.task5(arr3), true);
		System.out.println();
		System.out.println("Task #6");
		UtilsOld.printArray(UtilsExtra.task6(10), true);
		System.out.println();
		System.out.println("Task #7");
		UtilsOld.printArray(arr3, true);
		UtilsExtra.task7(arr3);
		System.out.println();
		System.out.println("Task #8");
		UtilsExtra.task8();
		System.out.println();
		System.out.println("Task #9");
		UtilsExtra.task9();
		System.out.println();
		System.out.println("Task #10");
		UtilsExtra.task10();
		System.out.println();
		System.out.println("Task #11");
		UtilsExtra.task11(15, 0, 9, true);
		System.out.println();
		System.out.println("Task #12");
		UtilsExtra.task12(8, 1, 10, false);
		System.out.println();
		System.out.println("Task #13");
		UtilsExtra.task13(5, 0, 5);
		System.out.println();
		System.out.println("Task #14");
		UtilsExtra.task14(4, 10, 99, true);
		System.out.println();
		System.out.println("Task #15");
		UtilsExtra.task15(20);
		System.out.println();
		System.out.println("Task #16");
		UtilsExtra.task16(12, -15, 15, true);
		System.out.println();
		System.out.println("Task #17");
		UtilsExtra.task17(10, 1, 9);
		System.out.println();
		System.out.println("Task #18");
		UtilsExtra.task18(10, -1, 1);
		System.out.println();
		System.out.println("Task #19");
		UtilsExtra.task19(-5, 5);
		System.out.println();
		System.out.println("Task #20");
		UtilsOld.printArray(UtilsExtra.task20(12, -10, 10), true);
		System.out.println();
		System.out.println("Task #21");
		UtilsExtra.task21();
		System.out.println();
		System.out.println("Task #22");
		UtilsExtra.task22(8, 5, 10, 99);
		System.out.println();
		System.out.println("Task #23");
		UtilsExtra.task23(5, 8, -99, 99);
		System.out.println();
		System.out.println("Task #24");
		UtilsExtra.task24(7, 4, -5, 5);
		System.out.println();
		System.out.println("Task #25");
		UtilsExtra.task25(6, 7, 0, 9);
		System.out.println();
		System.out.println("Task #26");
		UtilsExtra.task26(10, 10, 15);
		sc.close();
	}

}
