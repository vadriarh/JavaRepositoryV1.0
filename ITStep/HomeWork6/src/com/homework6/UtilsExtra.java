package com.homework6;

public class UtilsExtra {
	public static void task1() {
		int begin = -10, end = 25, count;
		System.out.println("Circle FOR");
		for (count = begin; count <= end; count++) {
			System.out.print(count + " ");
		}
		System.out.println();
		count = begin;
		System.out.println("Circle WHILE");
		while (count <= end) {
			System.out.print(count + " ");
			count++;
		}
		System.out.println();
		count = begin;
		System.out.println("Circle DO WHILE");
		do {
			System.out.print(count + " ");
			count++;
		} while (count <= end);
		System.out.println();
	}

	public static void task2() {
		int count, begin = 1, end = 100;
		for (count = begin; count <= end; count++) {
			if (count % 5 == 0) {
				System.out.print(count + " ");
			}
		}
		System.out.println();
	}

	public static void task3(int arr[], int minValue, int maxValue) {
		minValue = 0;
		maxValue = 100;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = minValue + (int) (Math.random() * (maxValue - minValue + 1));
		}
	}

	public static void task4(int arr[]) {
		int min = arr[0], max = arr[0], sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] == min || arr[i] == max) {
				sum -= arr[i];
			}

		}
		System.out.println("Min value = " + min + "\nMax value = " + max + "\nSumma = " + sum);
	}

	public static int[] task5(int arr[]) {
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[arr.length - 1 - i];
		}
		return arr2;
	}

	public static int[] task6(int size) {
		int arr[] = new int[size];
		int i = (size / 2);
		int j = (size / 2);
		int count = 0;
		while (j >= 0) {
			if (i != size) {
				arr[i] = count;
			}
			arr[j] = count;
			count++;
			i++;
			j--;
		}
		return arr;
	}

	public static void task7(int arr[]) {
		int max = 0, maxVal = 0, count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count >= max) {
				max = count;
				maxVal = arr[i];

			}
			count = 0;
		}
		if (max != 0) {
			System.out.println("Max element = " + maxVal + "\nMax count = " + (max + 1));
		} else {
			System.out.println("No matches");
		}

	}

	public static void task8() {
		System.out.print("Input math: ");
		double sum = 0, temp = 0;
		char tempSign = '*';
		boolean first = true;
		String str = Client.sc.nextLine();
		char arrayOfChar[] = new char[str.length()];
		arrayOfChar = str.toCharArray();
		for (int i = 0; i < arrayOfChar.length + 1; i++) {
			if (i == arrayOfChar.length || Character.isDigit(arrayOfChar[i]) != true) {
				if (first) {
					tempSign = arrayOfChar[i];
					sum = temp;
					first = false;
					temp = 0;
					continue;
				}
				switch (tempSign) {
				case '*':
					sum *= temp;
					break;

				case '/':
					sum /= temp;
					break;

				case '+':
					sum += temp;
					break;

				case '-':
					sum -= temp;
					break;
				}
				temp = 0;
				if (i != arrayOfChar.length) {
					tempSign = arrayOfChar[i];
				}

			} else {
				temp = temp * 10 + Character.digit(arrayOfChar[i], 10);
			}
		}
		System.out.println(sum);

	}

	public static void task9() {
		int min = 2, max = 20;
		int size = (max - min) / 2 + 1;
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			while (min <= max) {
				if (min % 2 == 0) {
					arr[i] = min;
					min++;
					break;
				}
				min++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void task10() {
		int min = 1, max = 99, size;
		size = (max + min) / 2;
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			while (min <= max) {
				if (min % 2 != 0) {
					arr[i] = min;
					min++;
					break;
				}
				min++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void task11(int size, int min, int max, boolean chet) {
		int arr[] = new int[size];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + (int) (Math.random() * (max - min + 1));
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] != 0) {
				count = chet ? count + 1 : count;
			} else {
				count = !chet ? count + 1 : count;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Count = " + count);
	}

	public static void task12(int size, int min, int max, boolean chetIndex) {
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + (int) (Math.random() * (max - min + 1));
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i % 2 != 0 && i != 0 && !chetIndex) {
				arr[i] = 0;
			} else if (i % 2 == 0 && i != 0 && chetIndex) {
				arr[i] = 0;
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void task13(int size, int min, int max) {
		double avg1, avg2, sum = 0;
		int arr1[] = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = min + (int) (Math.random() * (max - min + 1));
			sum += arr1[i];
		}
		avg1 = (double) sum / arr1.length;
		sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("Array#2 = {" + arr1[i]);
				continue;
			}
			System.out.print(", " + arr1[i]);
			if (i == arr1.length - 1) {
				System.out.println("}");
			}
		}

		int arr2[] = new int[size];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = min + (int) (Math.random() * (max - min + 1));
			sum += arr2[i];
		}
		avg2 = (double) sum / arr2.length;
		for (int i = 0; i < arr2.length; i++) {
			if (i == 0) {
				System.out.print("Array#2 = {" + arr2[i]);
				continue;
			}
			System.out.print(", " + arr2[i]);
			if (i == arr2.length - 1) {
				System.out.println("}");
			}
		}
		System.out.println("AVG of Array#1 = " + avg1);
		System.out.println("AVG of Array#2 = " + avg2);
	}

	public static void task14(int size, int min, int max, boolean progress) {
		boolean fail = false;
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + (int) (Math.random() * (max - min + 1));
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		if (progress) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					fail = true;
				}
			}
		} else {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					fail = true;
				}
			}
		}
		if (!fail) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void task15(int size) {
		int arr[] = new int[size];
		int first = 0, second = 1, third = 0;
		for (int i = 0; i < arr.length; i++) {
			second += third;
			arr[i] = second;
			third = first;
			first = second;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void task16(int size, int min, int max, boolean top) {

		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + (int) (Math.random() * (max - min + 1));
		}
		int tempVal = arr[0], tempIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (top) {
				if (tempVal <= arr[i]) {
					tempVal = arr[i];
					tempIndex = i;
				}
			} else {
				if (tempVal >= arr[i]) {
					tempVal = arr[i];
					tempIndex = i;
				}
			}
		}
		System.out.println(top ? "Max " : "Min " + "value = " + tempVal);
		System.out.println(top ? "Max " : "Min " + "index = " + tempIndex);
	}

	public static void task17(int size, int min, int max) {
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		double arr3[] = new double[size];
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = min + (int) (Math.random() * (max - min + 1));
			arr2[i] = min + (int) (Math.random() * (max - min + 1));
			if (arr1[i] == 0 || arr2[i] == 0) {
				arr3[i] = 0;
				continue;
			}
			arr3[i] = (double) arr1[i] / arr2[i];
			if (arr3[i] == (int) arr3[i]) {
				count++;
			}
		}
		System.out.print("arr1 = ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.print("arr2 = ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.print("arr3 = ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		System.out.println("Count = " + count);
	}

	public static void task18(int size, int min, int max) {
		int arr[] = new int[size];
		int temp[] = new int[size];
		int maxElem = 0, maxIndex = 0;
		System.out.print("arr = {");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + (int) (Math.random() * (max - min + 1));
			if (i == arr.length - 1) {
				System.out.print(arr[i] + "}");
				continue;
			}
			System.out.print(arr[i] + ", ");
		}
		for (int i = 0; i < arr.length; i++) {
			temp[i] = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp[i]++;
				}
			}

		}

		for (int i = 0; i < temp.length; i++) {
			if (maxElem <= temp[i]) {
				if (maxElem < temp[i]) {
					maxElem = temp[i];
					maxIndex = i;
				} else {
					return;
				}

			}
		}
		System.out.println();
		System.out.println("Max Element #" + maxIndex + " = " + arr[maxIndex]);

	}

	public static void task19(int min, int max) {
		System.out.print("Input size array(even number): ");
		int size;
		while (true) {
			size = Client.sc.nextInt();
			if (size % 2 != 0) {
				System.out.print("The number entered does not match the job condition.\nEnter the size again: ");
				continue;
			} else {
				break;
			}
		}
		int arr[] = new int[size];
		System.out.print("arr = {");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + (int) (Math.random() * (max - min + 1));
			if (i == arr.length - 1) {
				System.out.print(arr[i] + "}");
				continue;
			}
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		int sumLeft = 0, sumRight = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < (arr.length / 2)) {
				sumLeft += Math.abs(arr[i]);
				;
			} else {
				sumRight += Math.abs(arr[i]);
			}
		}
		if (sumLeft > sumRight) {
			System.out.println("Left");
		} else if (sumLeft == sumRight) {
			System.out.println("Equal");
		} else {
			System.out.println("Right");
		}

	}

	public static int[] task20(int size, int min, int max) {
		int countOfPositive = 0, countOfNegative = 0;
		if (size % 2 != 0) {
			System.out.print("The number entered does not match the job condition.");
			return null;
		}
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + (int) (Math.random() * (max - min + 1));
			if (arr[i] == 0) {
				i--;
				continue;
			} else if (arr[i] > 0) {
				countOfPositive++;
			} else {
				countOfNegative++;
			}
		}
		while (countOfNegative != countOfPositive) {
			int index = (int) (Math.random() * size);
			if (countOfNegative > countOfPositive && arr[index] < 0) {
				arr[index] *= (-1);
				countOfPositive++;
				countOfNegative--;
			}
			if (countOfNegative < countOfPositive && arr[index] > 0) {
				arr[index] *= (-1);
				countOfPositive--;
				countOfNegative++;
			}
		}
		return arr;
	}

	public static void task21() {
		System.out.print("Input number N: ");
		int n, count = 0;
		while (true) {
			n = Client.sc.nextInt();
			if (n < 3) {
				System.out.print("The number entered does not match the job condition.\nEnter the size again: ");
				continue;
			} else {
				break;
			}
		}
		int arr[] = new int[n];
		System.out.print("arr[]={");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * n + 1);
			if (arr[i] % 2 == 0) {
				count++;
			}
			if (i == arr.length - 1) {
				System.out.print(arr[i] + "}");
				continue;
			}
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		int arr2[] = new int[count];
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr2[count] = arr[i];
				count++;
			}
		}
		UtilsOld.printArray(arr2, true);

	}

	public static int[][] task22(int lines, int column, int min, int max) {
		int arr[][] = new int[lines][column];
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = min + (int) (Math.random() * (max - min + 1));
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		return arr;
	}

	public static void task23(int lines, int column, int min, int max) {
		int arr[][] = task22(lines, column, min, max);
		int maxValue = arr[0][0];
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < column; j++) {
				if (arr[i][j] > maxValue) {
					maxValue = arr[i][j];
				}
			}
		}
		System.out.println("Max Value = " + maxValue);
	}

	public static void task24(int lines, int column, int min, int max) {
		int arr[][] = task22(lines, column, min, max);
		int maxMultiplicities = 1, tempMultiplicities = 1, maxIndex = 0;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < column; j++) {
				tempMultiplicities *= Math.abs(arr[i][j]);
			}
			if (tempMultiplicities > maxMultiplicities) {
				maxMultiplicities = tempMultiplicities;
				maxIndex = i;
			}
			tempMultiplicities = 1;
		}
		System.out.println("Max Lines is " + (maxIndex + 1));
	}

	public static void task25(int lines, int column, int min, int max) {
		int arr[][] = task22(lines, column, min, max);
		int maxValue, maxIndex = 0, temp;
		for (int i = 0; i < lines; i++) {
			maxValue = arr[i][0];
			for (int j = 0; j < column; j++) {
				if (maxValue < arr[i][j]) {
					maxValue = arr[i][j];
					maxIndex = j;
				}
			}
			temp = arr[i][0];
			arr[i][0] = maxValue;
			arr[i][maxIndex] = temp;
		}
		System.out.println("=============");
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void task26(int column, int lines, int count) {
		int arr[][] = new int[column][lines];
		int firstFactor, secondFactor;
		for (int i = 1; i < column - 1; i++) {
			for (int j = i; j < lines - 1; j++) {
				arr[i][j] = 1;
			}
		}

		for (int i = 0; i < count; i++) {
			firstFactor = (int) (Math.random() * (column));
			secondFactor = (int) (Math.random() * (lines));
			if (arr[firstFactor][secondFactor] == 0) {
				i--;
				continue;
			} else {
				System.out.println((i + 1) + ". " + (firstFactor + 1) + " * " + (secondFactor + 1) + " = ");
				arr[firstFactor][secondFactor] = 0;
			}
		}
	}
}
