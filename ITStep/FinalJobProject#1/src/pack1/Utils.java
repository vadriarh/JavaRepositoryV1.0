package pack1;

public class Utils {
	public static int generateRandomNumber(int minBound, int maxBound) {
		return (int) (minBound + (int) (Math.random() * maxBound + 1 - minBound));
	}
	
	public static void printArray(int[] array) {
		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.println(".");
	}

	public static void printArray(String[] array) {
		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.println(".");
	}
}
