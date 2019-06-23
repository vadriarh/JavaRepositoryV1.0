package com.test;

import java.util.Scanner;

public class CasinoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the casino Last-Vegas");
		System.out.println("You want play");
		System.out.println("\t1.Yes\n\t2.No");
		System.out.print("Your choise: ");
		int choise, choiseGame;
		for (; true;) {
			choise = sc.nextInt();
			if (choise == 1 || choise == 2) {
				break;
			} else {
				System.out.println("Incorrect choise. Please make a choice.");
				System.out.print("Your choise: ");
				continue;
			}
		}

		if (choise != 2) {
			System.out.print("How much do you want to exchange for chips: ");

			double cash = sc.nextDouble();
			boolean winFlag = false;

			for (; true;) {
				System.out.println("You have " + cash + " chips on your hands");
				int rate = 0, color = 0, rateGen = 0, colorGen = 0;
				double bet, prize = 0;
				System.out.println("You are next to the tape measure.");
				System.out.println("What bet option will you choose?");
				System.out.println("\t1. On the number.\n\t2. On the color.\n\t3. On the number and on the color.");
				System.out.print("Your choise: ");

				for (; true;) {
					choiseGame = sc.nextInt();
					if (choiseGame == 1 || choiseGame == 2 || choiseGame == 3) {
						break;
					} else {
						System.out.println("Incorrect choise. Please make a choice.");
						System.out.print("Your choise: ");
						continue;
					}
				}

				switch (choiseGame) {
				case 1:
					System.out.println("What number from 1 to 36 do you want to bet on?");
					System.out.print("Your choise: ");

					for (; true;) {
						rate = sc.nextInt();
						if (rate > 0 && rate <= 36) {
							break;
						} else {
							System.out.println("Incorrect choise. Please make a choice.");
							System.out.print("Your choise: ");
							continue;
						}
					}

					rateGen = (int) (1 + Math.random() * 36);
					break;
				case 2:
					System.out.println("what color");
					System.out.println("1-red 2-black");
					System.out.print("Your choise: ");

					for (; true;) {
						color = sc.nextInt();
						if (color == 1 || color == 2) {
							break;
						} else {
							System.out.println("Incorrect choise. Please make a choice.");
							System.out.print("Your choise: ");
							continue;
						}
					}

					colorGen = 1 + (int) (Math.random() * 2);
					break;
				case 3:
					System.out.println("What number from 1 to 36 do you want to bet on?");
					System.out.print("Your choise: ");

					for (; true;) {
						rate = sc.nextInt();
						if (rate > 0 && rate <= 36) {
							break;
						} else {
							System.out.println("Incorrect choise. Please make a choice.");
							System.out.print("Your choise: ");
							continue;
						}
					}

					rateGen = 1 + (int) (Math.random() * 36);
					System.out.println("what color");
					System.out.println("1-red 2-black");
					System.out.print("Your choise: ");

					for (; true;) {
						color = sc.nextInt();
						if (color == 1 || color == 2) {
							break;
						} else {
							System.out.println("Incorrect choise. Please make a choice.");
							System.out.print("Your choise: ");
							continue;
						}
					}

					colorGen = 1 + (int) (Math.random() * 2);
					break;
				}
				System.out.println("What size bet do you bet?");
				System.out.print("Your bet: ");

				for (; true;) {
					bet = sc.nextDouble();
					if (bet <= cash) {
						break;
					} else {
						System.out.println("The size of the bet exceeds the value of your chips. Please place a bid.");
						System.out.print("Your bet: ");
						continue;
					}
				}

				cash -= bet;
				switch (choiseGame) {
				case 1:
					if (rate == rateGen) {
						prize = bet * 1.5;
						winFlag = true;
					} else {
						winFlag = false;
					}
					break;
				case 2:
					if (color == colorGen) {
						prize = bet * 1.2;
						winFlag = true;
					} else {
						winFlag = false;
					}
					break;
				case 3:
					if (rate == rateGen && color == colorGen) {
						prize = bet * 2;
						winFlag = true;
					} else {
						winFlag = false;
					}
					break;
				}
				cash += prize;
				if (winFlag) {
					System.out.println("Congratulations. You won " + prize + " chips");
					System.out.println("You now have " + cash + " chips");

				} else {
					System.out.println("You lose. Dont be upset. Next time lucky.");
					System.out.println("You have " + cash + " chips left.");
				}
				if (cash == 0) {
					System.out.println(
							"We are very sorry, but you ran out of chips. We will be glad to see you next time.");
					break;
				}

				System.out.println("Want to play again?");
				System.out.println("\t1.Yes\n\t2.No");
				System.out.print("Your choise: ");
				for (; true;) {
					choise = sc.nextInt();
					if (choise == 1 || choise == 2) {
						break;
					} else {
						System.out.println("Incorrect choise. Please make a choice.");
						System.out.print("Your choise: ");
						continue;
					}
				}
				if (choise == 1) {
					continue;
				} else {
					System.out.println("Thanks for playing. Come again.");
					break;
				}

			}

		} else {
			System.out.println("Come again. We will be glad to see you.");
		}
		sc.close();
	}

}
