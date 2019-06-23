package com.homework5;

import java.util.Scanner;

public class Client {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Welcome.\n\t1.Work.\n\t2.Exit.\nYour choose: ");
		int choose = Utils.inputVal(1, 2);
		if (choose == 1) {
			Menu.menu();
		}
		sc.close();
	}
}
