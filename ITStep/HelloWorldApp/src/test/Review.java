package test;

public class Review {

	public static boolean isIncOrder(int a, int b, int c) {
		if (a <= b && b <= c) {
			System.out.println("Parameters in ascending order");
			return true;

		}
		System.out.println("The parameters are not in ascending order");
		return false;

	}

	/**
	 * 
	 * @param arr -must be not null and length>1
	 * @return
	 */

	public static boolean isIncOrder(int arr[]) {

		if (arr != null && arr.length > 1) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					continue;
				} else {
					System.out.println("The parameters are not in ascending order");
					return false;
				}
			}
			System.out.println("Parameters in ascending order");
			return true;

		}

		return false;

	}

	public static void main(String[] args) {
		int arr[] = {};
		System.out.println(isIncOrder(arr));
		String str = "A" + "B";

	}

}
