package pack1;

public class IfAndCircle {
	public static double searchMin(double a, double b, double c, double d) {
		double min1, min2, result = 0;
		min1 = a > b ? b : a;
		min2 = c > d ? c : d;
		result = min1 > min2 ? min2 : min1;
		return result;
	}

	public static double searchMax(double a, double b, double c, double d) {
		double max1, max2, result = 0;
		max1 = a > b ? a : b;
		max2 = c > d ? d : c;
		result = max1 > max2 ? max1 : max2;
		return result;
	}

	public static void printFor(int start, int step, int count) {
		System.out.print(start);
		for (int i = 1; i < count; i++) {
			System.out.println(", " + (start + step * i));
		}
	}

	public static void printWhile(int start, int step, int count) {
		System.out.println(start);
		int i = 1;
		while (i < count) {
			System.out.println(", " + (start + step * i));
			i++;
		}
	}

	public static void printForRandom(int minBound, int maxBound, int count, boolean searchMax, boolean searchMin,
			boolean searchAvg) {
		int genNumber = Utils.generateRandomNumber(minBound, maxBound);
		int min, max, summa;
		min = max = summa = genNumber;
		System.out.print(genNumber);
		for (int i = 1; i < count; i++) {
			genNumber = Utils.generateRandomNumber(minBound, maxBound);
			if (genNumber > max)
				max = genNumber;
			if (genNumber < min)
				min = genNumber;
			summa += genNumber;
			System.out.print(", " + genNumber);
		}
		if (searchMax)
			System.out.println("Max = " + max);
		if (searchMin)
			System.out.println("Min = " + min);
		if (searchAvg)
			System.out.println("AVG = " + (summa / count));
	}

	public static void printWhileRandom(int minBound, int maxBound, int count, boolean searchMax, boolean searchMin,
			boolean searchAvg) {
		int genNumber = Utils.generateRandomNumber(minBound, maxBound);
		int min, max, summa;
		min = max = summa = genNumber;
		System.out.print(genNumber);
		int i = 1;
		while (i < count) {
			genNumber = Utils.generateRandomNumber(minBound, maxBound);
			if (genNumber > max)
				max = genNumber;
			if (genNumber < min)
				min = genNumber;
			summa += genNumber;
			System.out.println(", " + genNumber);
			i++;
		}
		if (searchMax)
			System.out.println("Max = " + max);
		if (searchMin)
			System.out.println("Min = " + min);
		if (searchAvg)
			System.out.println("AVG = " + (summa / count));
	}
}
