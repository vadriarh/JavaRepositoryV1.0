package com.homework5;

public class Utils {
	public static double inputDoubleVal() {
		double xDouble = Client.sc.nextDouble();
		return xDouble;
	}

	public static double inputDoubleVal(double min) {
		double xDouble;
		while (true) {
			xDouble = Client.sc.nextDouble();
			if (check(min, xDouble) == 1) {
				System.out.print(
						"The number entered does not match the job condition.\nEnter the number again.\nYour value: ");
				continue;
			} else {
				break;
			}
		}
		return xDouble;
	}

	public static double inputDoubleVal(double min, double max) {
		double xDouble;
		while (true) {
			xDouble = Client.sc.nextDouble();
			if (check(min, max, xDouble) == 1) {
				System.out.print(
						"The number entered does not match the job condition.\nEnter the number again.\nYour value: ");
				continue;
			} else {
				break;
			}
		}
		return xDouble;
	}

	public static int inputVal() {
		int val = Client.sc.nextInt();
		return val;

	}

	public static int inputVal(int min, int max) {
		int value;
		while (true) {
			value = Client.sc.nextInt();
			if (check(min, max, value) == 1) {
				System.out.print(
						"The number entered does not match the job condition.\nEnter the number again.\nYour value: ");
				continue;
			} else {
				break;
			}
		}
		return value;
	}

	public static int check(int min, int max, int value) {
		if (value < min | value > max) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int check(double min, double xDouble) {
		if (xDouble < min) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int check(double min, double max, double xDouble) {
		if (xDouble < min | xDouble > max) {
			return 1;
		} else {
			return 0;
		}
	}
}
