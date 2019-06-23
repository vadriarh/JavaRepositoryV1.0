package test;

public class Utils {
	public static void printArray(int arr[], boolean inline) {
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

	public static int findMax(int arr[]) {
		int value = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > value) {
				value = arr[i];
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

	public static int[] reverse(int arr[]) {
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[arr.length - 1 - i];
		}
		return arr2;
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

	public static void selectingSort(int arr[]) {

		for (int index = 0; index < arr.length; index++) {
			int min_val = arr[index];
			int min_index = index;// полагаем что итый элемент минимальный
			for (int next_index = index + 1; next_index < arr.length; next_index++) {
				if (arr[next_index] < min_val) {// пробежаться и сравнить с оставшимися элементами
					min_index = next_index;
					min_val = arr[next_index];
				}
				// SWAP
				if (index != min_index) {
					int temp = arr[index];
					arr[index] = arr[min_index];
					arr[min_index] = temp;
				}

			}
		}
	}

	public static void bubbleSort(int arr[]) {
		for (int i = arr.length - 1; i > 0; i--) {// внешний цикл, который нужен чтобы сокращать массив
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static double parseString(String str) {
		char arr[] = str.toCharArray();
		String doubleStr = "";
		for (char c : arr) {// применяется к перебираемым множествам
			// arr пербираемое множество
			// с-новый представитель из множества
			if (Character.isDigit(c)) {
				doubleStr += c;
			}
		}
		if (doubleStr.length() == 0)
			return 0.0;
		return Double.parseDouble(doubleStr);
	}

	public static String generateStr(int size) {
		String base = "1234567890qwertyuiopasdfghjklzxcvbnm";
		String ranStr = "";
		for (int i = 0; i < size; i++) {
			ranStr += base.charAt((int) (Math.random() * base.length()));
		}
		return ranStr;
	}

	public static int searchSubStrings(String str, String subStr) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(subStr, index) != -1) {
				index = str.indexOf(subStr, index);
				count++;
			}
		}
		return count;
	}
}
