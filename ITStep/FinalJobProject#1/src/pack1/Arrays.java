package pack1;

public class Arrays {
	public static int[] example1(int start, int step, int count) {
		int[] array = new int[count];
		for (int i = 0; i < array.length; i++) {
			array[i] = start + step * i;
		}
		return array;
	}

	public static String[] example2(String start, int count) {
		String[] array = new String[count];
		String temp = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				temp += start;
			}
			array[i] = start + temp + i;
			temp = "";
		}
		return array;
	}

	public static int[] example3(int start, int step, int count) {
		int[] array = new int[count];
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i] = start + step * i;
			} else {
				array[i] = -(start + step * i);
			}

		}
		return array;
	}

	public static int[] generateRandomNumber(int minBound, int maxBound, int count) {
		int[] array = new int[count];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.generateRandomNumber(minBound, maxBound);
		}
		return array;
	}

	public static int searchMinArray(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;
	}

	public static int searchMaxArray(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		return max;
	}

	public static double avg(int[] array) {
		int summa = 0;
		for (int element : array) {
			summa += element;
		}
		return summa / array.length;
	}

	public static int[] sortArray(int[] array) {
		int indexMin, min, temp;
		indexMin = 0;		
		for (int i = 0; i < array.length; i++) {
			min = array[i];
			for (int j = i; j < array.length; j++) {
				if (min >= array[j]) {
					min = array[j];
					indexMin = j;
				}
			}
			temp = array[i];
			array[i] = array[indexMin];
			array[indexMin] = temp;
		}
		return array;
	}
}
