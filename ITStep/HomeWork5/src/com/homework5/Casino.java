package com.homework5;

import static com.homework5.Utils.inputVal;

public class Casino {
	static int choose, sumPlayer, sumBank;
	static boolean play, winFlag;
	static double cash, bet, prize = 0, bank;

	public static void gameRoulette() {
		int rate = 0, color = 0, rateGen = 0, colorGen = 0;
		System.out.println("You are next to the tape measure.");
		System.out.println("What bet option will you choose?");
		System.out.println("\t1. On the number.\n\t2. On the color.\n\t3. On the number and on the color.");
		System.out.print("Your choise: ");
		choose = Utils.inputVal(1, 3);
		switch (choose) {
		case 1:
			System.out.println("What number from 1 to 36 do you want to bet on?");
			System.out.print("Your choise: ");
			rate = Utils.inputVal(1, 36);
			rateGen = 1 + (int) (Math.random() * 36);
			break;
		case 2:
			System.out.println("What color");
			System.out.println("1-red 2-black");
			System.out.print("Your choise: ");
			color = Utils.inputVal(1, 2);
			colorGen = 1 + (int) (Math.random() * 2);
			break;
		case 3:
			System.out.println("What number from 1 to 36 do you want to bet on?");
			System.out.print("Your choise: ");
			rate = Utils.inputVal(1, 36);
			rateGen = 1 + (int) (Math.random() * 36);
			System.out.println("What color");
			System.out.println("1-red 2-black");
			System.out.print("Your choise: ");
			color = Utils.inputVal(1, 2);
			colorGen = 1 + (int) (Math.random() * 2);
			break;

		}
		System.out.println("What size bet do you bet?");
		System.out.print("Your bet: ");
		bet = Utils.inputDoubleVal(0, cash);
		cash -= bet;
		switch (choose) {
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
			System.out.println("We are very sorry, but you ran out of chips. We will be glad to see you next time.");
			play = false;
			return;
		}
		repeatGame();
	}

	public static void game21() {
		System.out.println("You have chosen to play 21.");
		int deckOfCards[] = new int[36];
		int cardsOfPlayer[] = new int[10];
		int cardsOfBank[] = new int[10];
		int count, bound;
		for (count = 0; count < deckOfCards.length; count++) {
			deckOfCards[count] = (int) (Math.random() * (deckOfCards.length));
		}
		for (count = 0; count < deckOfCards.length; count++) {
			for (int j = 0; j < count; j++) {
				if (deckOfCards[count] == deckOfCards[j] && count != j) {
					deckOfCards[count] = (int) (Math.random() * (deckOfCards.length));
					count = 0;
				}
			}
		}
		System.out.println("What size bet do you bet?");
		System.out.print("Your bet: ");
		bet = Utils.inputDoubleVal(0, cash);
		cash -= bet;
		bank = bet * 2;
		sumBank = sumPlayer = 0;
		System.out.println("");
		int i = 0;
		for (bound = 0; bound < 4; bound++) {
			cardsOfPlayer[i] = deckOfCards[bound];
			bound++;
			cardsOfBank[i] = deckOfCards[bound];
			i++;
		}
		System.out.println("Your cards: 2of2 ");
		sumPlayer = transferCards(cardsOfPlayer[0], sumPlayer, false, true);
		sumPlayer = transferCards(cardsOfPlayer[1], sumPlayer, true, true);
		System.out.println("Banker cards: 1of2 ");
		sumBank = transferCards(cardsOfBank[0], sumBank, false, true);
		sumBank = transferCards(cardsOfBank[1], sumBank, false, false);
		System.out.println("Close card.");

		while (true) {
			if (winFlag) {
				System.out.println("Congralulations. You won " + bank + " chips.");
				cash += bank;
				break;
			}
			if (sumPlayer > 21 || sumBank == 21) {
				System.out.println("You lose");
				break;
			}
			System.out.print("Do you want to take another card?\n1.Yes.\t2.No.\nYour answer: ");
			choose = Utils.inputVal(1, 2);
			if (choose == 1) {
				System.out.println("What size bet do you bet?");
				System.out.print("Your bet: ");
				bet = Utils.inputDoubleVal(0, cash);
				cash -= bet;
				bank += bet * 2;
				cardsOfPlayer[i] = deckOfCards[bound];
				sumPlayer = transferCards(cardsOfPlayer[i], sumPlayer, true, true);
				bound++;
				i++;
				continue;
			} else {
				System.out.println("Player's total cost = " + sumPlayer);
				System.out.println("Banker cards: ");
				int tempSumBank;
				sumBank = 0;
				i = 2;
				sumBank = transferCards(cardsOfBank[0], sumBank, false, true);
				sumBank = transferCards(cardsOfBank[1], sumBank, false, true);
				while (true) {
					cardsOfBank[i] = deckOfCards[bound];
					tempSumBank = transferCards(cardsOfBank[i], 0, false, false);
					if (sumBank + tempSumBank > 21) {
						break;
					} else {
						sumBank = transferCards(cardsOfBank[i], sumBank, false, true);
						i++;
						bound++;
					}
				}
				System.out.println("Banker total cost = " + sumBank);
				if (sumPlayer > sumBank) {
					winFlag = true;
					continue;
				} else {
					System.out.println("You lose");
					break;
				}

			}

		}
		repeatGame();

	}

	public static int transferCards(int index, int summa, boolean carriageReturn, boolean visible) {
		index++;
		int mark, number;
		number = index % 9;
		mark = (index / 9) + 1;
		if (visible) {
			switch (number) {
			case 0:
				System.out.print("6 (");
				summa += 6;
				break;
			case 1:
				System.out.print("7 (");
				summa += 7;
				break;
			case 2:
				System.out.print("8 (");
				summa += 8;
				break;
			case 3:
				System.out.print("9 (");
				summa += 9;
				break;
			case 4:
				System.out.print("10 (");
				summa += 10;
				break;
			case 5:
				System.out.print("Jack (");
				summa += 2;
				break;
			case 6:
				System.out.print("Queen (");
				summa += 3;
				break;
			case 7:
				System.out.print("King (");
				summa += 4;
				break;
			case 8:
				System.out.print("Ace (");

				if ((summa + 11) < 21) {
					summa += 11;
				} else if ((summa + 1) == 21 || (summa + 11) == 21) {
					winFlag = true;
					summa = 21;
				} else if ((summa + 1) < 21 && (summa + 11) > 21) {
					summa += 1;
				}
				break;
			}
			switch (mark) {
			case 1:
				System.out.println("Hearts (red))");
				break;
			case 2:
				System.out.println("Spades (black))");
				break;
			case 3:
				System.out.println("Diamonds (yellow))");
				break;
			case 4:
				System.out.println("Clubs (blue))");
				break;
			}
			if (carriageReturn) {
				System.out.println("Total cost = " + summa);
			}
			carriageReturn = false;
		} else {
			switch (number) {
			case 0:
				summa += 6;
				break;
			case 1:
				summa += 7;
				break;
			case 2:
				summa += 8;
				break;
			case 3:
				summa += 9;
				break;
			case 4:
				summa += 10;
				break;
			case 5:
				summa += 2;
				break;
			case 6:
				summa += 3;
				break;
			case 7:
				summa += 4;
				break;
			case 8:

				if ((summa + 11) < 21) {
					summa += 11;
				} else if ((summa + 1) == 21 || (summa + 11) == 21) {
					winFlag = true;
					summa = 21;
				} else if ((summa + 1) < 21 && (summa + 11) > 21) {
					summa += 1;
				} else {
				}
				break;
			}

			if (carriageReturn) {
				System.out.println("Total cost = " + summa);
			}
			carriageReturn = false;
		}
		return summa;
	}

	public static void gameOnCasino() {
		System.out.println("Welcome to the casino Last-Vegas");
		System.out.println("You want play");
		System.out.println("\t1.Yes\n\t2.No");
		System.out.print("Your choise: ");
		choose = inputVal(1, 2);
		play = true;
		switch (choose) {
		case 1:
			System.out.print("How much do you want to exchange for chips: ");
			cash = Utils.inputDoubleVal(0);
			while (play) {
				System.out.println("You have " + cash + " chips on your hands");
				System.out.print("What do you want to play?\n\t1.Roulette\n\t2.21\n\t3.Exit\nYour choise: ");
				choose = inputVal(1, 2);
				switch (choose) {
				case 1:
					gameRoulette();
					break;
				case 2:
					Casino.game21();
					break;
				case 3:
					System.out.println("GoodBye.");
					break;
				}
			}
			System.out.println("You have " + cash + " chips on your hands");
			break;
		case 2:
			System.out.println("GoodBye.");
			break;
		}
	}

	public static void repeatGame() {
		System.out.println("Want to play again?");
		System.out.println("\t1.Yes\n\t2.No");
		System.out.print("Your choise: ");
		choose = Utils.inputVal(1, 2);
		if (choose == 2) {
			System.out.println("Thanks for playing. Come again.");
			play = false;
			Menu.menu();
		} else {
			gameOnCasino();
		}
	}
}
