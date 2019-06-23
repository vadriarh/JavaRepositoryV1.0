package com.test;

import java.util.Scanner;
import static com.test.Utils.*;

public class WhileTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Values: ");
		int num = sc.nextInt();
		fib(num);
		sc.close();

	}

}
