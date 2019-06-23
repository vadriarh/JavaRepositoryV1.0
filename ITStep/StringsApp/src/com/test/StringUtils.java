package com.test;

public class StringUtils {
	public static boolean isContainsIngnoreCase(String str, String subSttr) {
		String strToLowerCase = str.toLowerCase();
		String subStrToLowerCase = subSttr.toLowerCase();
		boolean result = strToLowerCase.contains(subStrToLowerCase);
		return result;
	}

	public static void bufferBulderTest(String str, int count) {
		long start;
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder(Integer.MAX_VALUE);
		sb.append(str);
		try {
			for (int i = 0; i < count; i++) {
				sb.append(i);
			}
		} catch (OutOfMemoryError e) {
			System.out.println("OutOfMemoryError. Capacity: " + sb.capacity() + "   length: " + sb.length());
			e.printStackTrace();

		}

		System.out.println("bulderTest -> ");
		System.out.println("result" + (System.currentTimeMillis() - start));
		start = System.currentTimeMillis();
		StringBuffer sb2 = new StringBuffer(Integer.MAX_VALUE);
		sb2.append(str);
		try {
			for (int i = 0; i < count; i++) {
				sb2.append(i);
			}
		} catch (OutOfMemoryError e) {
			System.out.println("OutOfMemoryError. Capacity: " + sb2.capacity() + "   length: " + sb2.length());
			e.printStackTrace();
		}
		System.out.println("bufferTest -> ");
		System.out.println("result" + (System.currentTimeMillis() - start));
	}

	public static void bufferTest(String str, int count) {

	}

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("text");
//		// String s = "some text here";
//		System.out.println("capacity: " + sb.capacity());
//		System.out.println("length: " + sb.length());
//		System.out.println(sb.reverse());
//
//		System.out.println("CIRCLE");
//		for (int i = 0; i < 100; i++) {
//			sb.append(i);
//			System.out.println("capacity: " + sb.capacity());
//			System.out.println("length: " + sb.length());
//		}
//		System.out.println(sb.toString());
//		System.out.println("capacity: " + sb.capacity());
		//bufferBulderTest("AAA", 200000000);
		for (int i = 1; i < Integer.MAX_VALUE; i+=100000) {
			try {
				char[]arr=new char[i];
			} catch (Exception e) {
				System.out.println(i);
				e.printStackTrace();
				break;
			}
		}
	}
}