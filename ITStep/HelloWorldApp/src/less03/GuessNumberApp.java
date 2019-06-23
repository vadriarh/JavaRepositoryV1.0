package less03;

import java.util.Scanner;

public class GuessNumberApp {

	public static void main(String[] args) {
		System.out.println("Welcome. Random value was generated!");
		System.out.println("from 1 to 5");
		int x = 1 + (int) (Math.random() * 5);
		System.out.print("Try to guess: ");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		if (x == answer) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose! =[");
		}
		sc.close();
	}

}
