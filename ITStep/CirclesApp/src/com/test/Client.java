package com.test;

import static com.test.Utils.*;

//import static java.lang.System.*;
public class Client {

	public static void main(String[] args) {
		printDate();
		printDate();
		int x = generateRandomValue();
		x++;

		print(x);
		print(generateRandomValue(50));
		double a = 20, b = 5;
		print(addition(a, b));
		print(subtraction(a, b));
		print(multiplication(a, b));
		print(division(a, b));
		print(multiplication(generateRandomValue(500), generateRandomValue()));
		print("Max = " + findMax(generateRandomValue(500), generateRandomValue()));
	}

}
