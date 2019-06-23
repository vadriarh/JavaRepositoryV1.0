package com.homework7;

public class Utils {
	public static int[] createTempArrayOfChar(String str) {
		int arr[] = new int[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}
		return arr;
	}

	public static String InputToStr() {
		String str = Client.sc.nextLine();
		return str;
	}

}
