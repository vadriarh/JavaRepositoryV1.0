package com.test;

public class Client {

	public static void main(String[] args) {
		PerformanceAnalyzer.start("ARRAYS JOB");
//		int arr[] = //{ 55, 33, 55, 78 };
//		for (int i = 0; i < 10000000; i++) {
//			Utils.generateAndPopulateArray(10, 25);
//		}
//		Utils.printArray(arr, true);
//		System.out.println();
//		Utils.printArray(arr, false);
//		System.out.println();
//		int arr2[] = Utils.generateAndPopulateArray(10, 25);
//		Utils.printArray(arr2, true);
//		int arr3[] = Utils.mixArray(arr2);
//		Utils.printArray(arr3, true);
//		System.out.println(Utils.find(arr, true));
//		System.out.println(Utils.find(arr, false));
//		Utils.printArray(Utils.reverse(arr3), true);
//		int[] array = // {40, -50, -9, 22, -2, -40, 20, 29, 27, 35};
//				Utils.generateAndPopulateArray(10, 50);
//		Utils.printArray(array, true);
//		Utils.selectingSort(array);
//		Utils.printArray(array, true);
//		Utils.printArray(arr2, true);
//		Utils.printArray(array, true);
//		Utils.printArray(Utils.union(arr2, array), true);

		String str = "ffkfkfcat213542jfjdkcat3945r8cat";

		// Utils.generateStr(500);
		System.out.println(str);
		String str2 = Utils.generateStr(2);
		System.out.println(str2);
//		double d=Utils.parseString(str);

		// d++;
//		System.out.println(d);
		System.out.println(Utils.searchSubStrings(str, str2));

		PerformanceAnalyzer.end();
	}

}
