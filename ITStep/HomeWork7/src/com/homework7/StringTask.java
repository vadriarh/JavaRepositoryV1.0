package com.homework7;

public class StringTask {

	public static void task1(String str) {

	}

	public static void task2(String str) {
		if (!str.isEmpty()) {
			int count = 1;
			int sizeOfStr = str.length();
			int arr[] = Utils.createTempArrayOfChar(str);
			for (int i = 0; i < sizeOfStr; i++) {
				if (arr[i] != 0) {
					for (int j = i + 1; j < sizeOfStr; j++) {
						if (str.charAt(i) == str.charAt(j) && arr[j] == 1) {
							count++;
							arr[j] = 0;
						}
					}
				}

				if (count == 2) {
					System.out.print(str.charAt(i) + " ");
				}
				count = 1;
			}
		} else {
			System.out.println("Line is empty");
		}
	}

	public static void task3(String str) {
		if (!str.isEmpty()) {
			int maxCount = 1, count = 1, maxIndex = 0;
			int sizeOfStr = str.length();
			int arr[] = Utils.createTempArrayOfChar(str);
			for (int i = 0; i < sizeOfStr; i++) {
				if (arr[i] != 0) {
					for (int j = i + 1; j < sizeOfStr; j++) {
						if (str.charAt(i) == str.charAt(j) && arr[j] == 1) {
							count++;
							arr[j] = 0;
						}
						arr[i] = count;
					}
				}
				if (arr[i] > maxCount) {
					maxCount = arr[i];
					maxIndex = i;
				}
				count = 1;
			}
			System.out.print(str.charAt(maxIndex) + " ");
		} else {
			System.out.println("Line is empty");
		}
	}

	public static void task4(String str) {
		if (!str.isEmpty()) {
			int sizeOfStr = str.length();
			for (int i = 0; i < sizeOfStr; i++) {
				char ch = str.charAt(i);
				if (Character.isAlphabetic(ch)) {
					if (Character.isLowerCase(ch)) {
						System.out.print(Character.toUpperCase(ch));
					} else {
						System.out.print(Character.toLowerCase(ch));
					}
				} else {
					System.out.print(ch);
				}
			}
		} else {
			System.out.println("Line is empty");
		}
	}

	public static void task5() {
		System.out.print("Input your text:");
		String str = Utils.InputToStr();
		if (!str.isEmpty()) {
			int sizeOfStr = str.length();
			for (int i = 0; i < sizeOfStr; i++) {
				char ch = str.charAt(i);
				if (ch == ' ') {
					System.out.println();
				} else {
					System.out.print(ch);
				}
			}
		} else {
			System.out.println("Line is empty");
		}
	}

	public static void task6(String str) {
		int sizeOfStr = str.length();
		char arraySubStr[] = new char[3];
		for (int indexOfStartSubStr = 0; indexOfStartSubStr < sizeOfStr - 2; indexOfStartSubStr++) {
			str.getChars(indexOfStartSubStr, indexOfStartSubStr + 2, arraySubStr, 0);
			String subStr = new String(arraySubStr);
			int index = indexOfStartSubStr;
			while (true) {
				if (str.indexOf(subStr, index) != -1) {
					index = str.indexOf(subStr, index);
				} else {
					break;
				}
			}

		}
	}

	public static void task7() {

	}

}
