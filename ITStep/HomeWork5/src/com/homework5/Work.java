package com.homework5;

public class Work {
	static double cash = 500, bet, bank;
	static int sumBank, sumPlayer, choose;
	static boolean winFlag = false;

	public static void main(String[] args) {
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

}
