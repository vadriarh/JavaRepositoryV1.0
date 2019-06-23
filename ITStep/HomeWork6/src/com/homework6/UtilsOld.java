package com.homework6;

public class UtilsOld {
	public static void printArray(int arr[], boolean inline) {
		if (arr != null) {
			if (inline) {
				System.out.print("arr[]={");
				for (int i = 0; i < arr.length; i++) {
					if (i != arr.length - 1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.println(arr[i] + "}");
					}
				}
			} else {
				for (int i = 0; i < arr.length; i++) {
					System.out.println("arr[" + i + "] = " + arr[i]);
				}
			}
		} else {
			System.out.println("Miss array");
		}
	}

	public static int[] generateAndPopulateArray(int size, int bound) {
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			// arr[i] = (-1)*(bound/2)+(int) (Math.random() * (bound + 1));
			boolean isPositive = ((int) (Math.random() * 2) == 1);
			arr[i] = ((int) (Math.random() * bound) * (isPositive ? 1 : -1));
		}
		return arr;
	}

	public static int find(int arr[], boolean isMax) {
		int value = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (isMax) {
				if (arr[i] > value) {
					value = arr[i];
				}
			} else {
				if (arr[i] < value) {
					value = arr[i];
				}
			}
		}
		return value;
	}

	public static int findMin(int arr[]) {
		int value = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < value) {
				value = arr[i];
			}
		}
		return value;
	}

	public static int[] reverse(int arr[]) {
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[arr.length - 1 - i];
		}
		return arr2;
	}

	public static int[] mixArray(int arr[]) {
		int arr2[] = new int[arr.length];
		int arrIndex[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrIndex[i] = (int) (Math.random() * (arr.length));
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arrIndex[i] == arrIndex[j] && i != j) {
					arrIndex[i] = (int) (Math.random() * (arr.length));
					i = 0;
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
			arr2[arrIndex[i]] = arr[i];
		return arr2;
	}

	public static int[] sortArray(int arr[]) {
		int min, minIndex = 0, temp;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = min;
			arr[minIndex] = temp;
		}

		return arr;
	}

	public static int[] intersection(int arr1[], int arr2[]) {
		int resultArraySize = 0, minArraySize, maxArraySize;
		int minArr[];
		minArraySize = arr1.length > arr2.length ? arr2.length : arr1.length;
		maxArraySize = minArraySize == arr1.length ? arr2.length : arr1.length;
		minArr = arr1.length > arr2.length ? arr2 : arr1;
		int repVal[] = new int[minArraySize];
		for (int i = 0; i < repVal.length; i++) {
			repVal[i] = 0;
		}
		for (int i = 0; i < minArraySize; i++) {
			for (int j = 0; j < maxArraySize; j++) {
				if (arr1[i] == arr2[j]) {
					resultArraySize++;
					repVal[i] = 1;
					j = arr2.length;
				}
			}
		}
		if (resultArraySize != 0) {
			int resultArray[] = new int[resultArraySize];
			for (int i = 0, index = 0; i < minArraySize; i++) {
				if (repVal[i] == 1) {
					resultArray[index] = minArr[i];
					index++;
				}
			}

			return resultArray;
		} else {
			System.out.println("No intersection");
			return null;
		}
	}

	public static int[] union(int arr[], int arr2[]) {
		int newSize = arr.length + arr2.length;
		int resultArraySize = newSize;
		int tempArray[][] = new int[newSize][2];
		for (int i = 0, j = 0; i < newSize; i++, j++) {
			if (i < arr.length) {
				tempArray[i][0] = arr[j];
			} else if (i == arr.length) {
				j = 0;
				tempArray[i][0] = arr2[j];
			} else {
				tempArray[i][0] = arr2[j];
			}
		}
		for (int i = 0; i < newSize; i++) {
			tempArray[i][1] = 0;
		}
		for (int i = 0; i < newSize; i++) {
			for (int j = i + 1; j < newSize; j++) {
				if (tempArray[i][0] == tempArray[j][0] && tempArray[j][1] == 0) {
					tempArray[j][1] = 1;
					resultArraySize--;
				}
			}
		}
		int resultArray[] = new int[resultArraySize];
		for (int i = 0, j = 0; i < newSize; i++) {
			if (tempArray[i][1] == 0) {
				resultArray[j] = tempArray[i][0];
				j++;
			}
		}
		return resultArray;
	}

}
