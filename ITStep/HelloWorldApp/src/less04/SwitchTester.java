package less04;

import java.util.Scanner;

public class SwitchTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = (int) (Math.random() * 5);
		switch (key) {
		case 2:
			System.out.println("Case #2");
			break;
		case 3:
			System.out.println("Case #3");
			break;
		default:
			System.out.println("Default case");
			break;
		}
		int numOfWeekDay = 4;
		switch (numOfWeekDay) {
		case 1:
			System.out.println("RIGHT");
			break;
		case 2:
			System.out.println("RIGHT");
			break;
		case 3:
			System.out.println("RIGHT");
			break;
		case 4:
			System.out.println("RIGHT");
			break;
		case 5:
			System.out.println("RIGHT");
			break;
		case 6:
			System.out.println("RIGHT");
			break;
		case 7:
			System.out.println("RIGHT");
			break;

		default:
			System.out.println("INCORRECT NUMBER OF WEEK DAY!");
			break;
		}
		char ch = 'x';
		switch (ch) {
		case 'a':
		case 'e':
		case 'y':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;

		default:
			if (!Character.isAlphabetic(ch)) {
				System.out.println("Character is Not a Unicode alphabet character");
			} else {
				System.out.println("consonant");
			}
			break;
		}
		System.out.println((int) ('x'));
		int temp = (-30) + (int) (Math.random() * 61);
		int counter;
		if (temp <= 0) {
			if (temp <= -15)
				counter = 1;
			else
				counter = 2;
		} else {
			if (temp >= 10)
				counter = 4;
			else
				counter = 3;
		}
		switch (counter) {
		case 1:
		case 2:
		case 3:
		case 4:
		}
		int num = 37;
		System.out.println(num % 2 == 0 ? "II" : "I");
		System.out.println("как вводим?1-мануально2-генерировать3-по дефолту =5");
		int choise = sc.nextInt();
		switch (choise) {
		case 1:

			break;

		default:
			break;
		}
		sc.close();

	}
}
