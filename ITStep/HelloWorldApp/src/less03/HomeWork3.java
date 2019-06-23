package less03;

import java.io.IOException;
import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) throws IOException {
		int min, max, counter = 1, answer;
		boolean winFlag = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Welcome.\nFrom which number to start the generation: ");
		min = sc.nextInt();
		System.out.print("Specify the upper limit of the generation number: ");
		max = sc.nextInt();
		int x = min + (int) (Math.random() * (max + 1 - min));
		System.out.println(x);
		System.out.println("Generation number produced. You have 3 attempts.\nTry to guess.");

		if (winFlag != true) {// первая попытка
			System.out.print(counter + " try: ");
			answer = sc.nextInt();
			if (answer == x) {
				System.out.println("Congratulations. You won with " + counter + " attempts");
				winFlag = true;
			} else {
				if (counter <= 3) {
					if (answer > x) {
						System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

					} else {
						System.out.println("You are mistaken.\nThe guess number is greater than the one you entered");
					}
					counter++;
				}
			}
		}

		if (winFlag != true) {// вторая попытка
			System.out.print(counter + " try: ");
			answer = sc.nextInt();
			if (answer == x) {
				System.out.println("Congratulations. You won with " + counter + " attempts");
				winFlag = true;
			} else {
				if (counter <= 3) {
					if (answer > x) {
						System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

					} else {
						System.out.println("You are mistaken.\nThe guess number is greater than the one you entered");
					}
					counter++;
				}
			}
		}

		if (winFlag != true) {// третья попытка
			System.out.print(counter + " try: ");
			answer = sc.nextInt();
			if (answer == x) {
				System.out.println("Congratulations. You won with " + counter + " attempts");
				winFlag = true;
			} else {
				if (counter <= 3) {
					if (answer > x) {
						System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

					} else {
						System.out.println("You are mistaken.\nThe guess number is greater than the one you entered");
					}
					counter++;
				}
			}
		}

		if (counter > 3) {
			System.out.print("Your attempts have ended.");
		}

		System.out.print("Want to play again?\n\t1 - no\n\t2 - yes\nYour choise: ");
		answer = sc.nextInt();
		if (answer == 1) {
			System.out.println("Thanks for playing. See you next time");
		} else if (answer == 2) {
			Runtime.getRuntime().exec("java.exe -jar HomeWork3.jar");
		}

		sc.close();
	}
}
