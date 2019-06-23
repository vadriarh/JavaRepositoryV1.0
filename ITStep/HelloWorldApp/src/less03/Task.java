package less03;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1, m2, m3, m4, m5, iq;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first mark: ");
		m1 = sc.nextInt();
		System.out.print("Input second mark: ");
		m2 = sc.nextInt();
		System.out.print("Input third mark: ");
		m3 = sc.nextInt();
		System.out.print("Input fourth mark: ");
		m4 = sc.nextInt();
		System.out.print("Input fifth mark: ");
		m5 = sc.nextInt();
		System.out.print("Input your IQ: ");
		iq = sc.nextInt();
		int markRand = (int) (Math.random() * 11);
		avg = (m1 + m2 + m3 + m4 + m5 + markRand) / 6.0;
		System.out.println(markRand);
		if (avg >= 8.0) {
			System.out.println("You are good student.");
		} else if (iq >= 100) {
			System.out.println("You are lazy student.");
		} else {
			System.out.println("You are stupid student.");
		}
		sc.close();
	}

}
