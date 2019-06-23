package wrappers;

public class Task {

	static Long summa(String a, String b) {
		Long result = null;
		try {
			result = new Long(a) + new Long(b);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.err.println("Bad input. A =" + a + ", B = " + b);
		}
		return result;
	}

	static Boolean isSmart(String marks[], Integer iq) {// 8.0<&&120<
		int count, summa;
		count = summa = 0;
		double avg = 0;
		for (String mark : marks) {
			try {
				int val = Integer.parseInt(mark);
				if (val >= 0 & val <= 10) {
					summa += val;
					count++;
				} else {
					System.err.println("Not valid mark = " + val);
				}
			} catch (NumberFormatException e) {
				System.err.println("Not parseble String");
			}
		}
		if (count > 0) {
			avg = summa / (double) count;
		}
		return avg >= 8.0 && iq >= 120;
	}

	static void printDoublesOnly(Object o) {
		if (o instanceof Object[]) {
			Object[] arr = (Object[]) o;
			for (Object obj : arr) {
				if (obj != null) {
					try {
						if (obj instanceof String) {
							System.out.println(Double.parseDouble((String) obj));
						} else if (obj instanceof Number) {
							System.out.println(((Number)obj).doubleValue());
						}
					} catch (Exception e) {
						System.err.println("Something goes wrong :" + e.getClass());
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(summa("23", "52"));
		System.out.println(isSmart(new String[] { "9", "7", "8", "7" }, 121));
		Object arr[] = { true, new Double("15.42"), new String("77.0"), "56.42", new Object(), Integer.MAX_VALUE };
		printDoublesOnly(arr);
	}

}
