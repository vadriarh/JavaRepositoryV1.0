package less04;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, choise;
		System.out.print("Task #: ");
		choise = sc.nextInt();
		switch (choise) {

		case 1:
			System.out.print("Input number A: ");
			a = sc.nextInt();
			System.out.print("Input number B: ");
			b = sc.nextInt();
			System.out.print("Input number C: ");
			c = sc.nextInt();
			if (a < b && b < c) {
				a *= 2;
				b *= 2;
				c *= 2;
			} else if (a > (Math.pow((b + c), 2))) {
				System.out.println("BAD CASE");
				break;
			} else {
				a = -a;
				b = -b;
				c = -c;
			}
			System.out.printf("New values: A = %d, B = %d, C=%d.\n", a, b, c);
			break;

		case 2:
			int d;
			System.out.print("Input number #1.A: ");
			a = sc.nextInt();
			System.out.print("Input number #2.B: ");
			b = sc.nextInt();
			System.out.print("Input number #3.C: ");
			c = sc.nextInt();
			System.out.print("Input number #4.D: ");
			d = sc.nextInt();
			if ((a == b) & (b == c) & (a != d)) {
				System.out.println("It's number #4.D");
			} else if ((a == b) & (b == d) & (a != c)) {
				System.out.println("It's number #3.C");
			} else if ((a == c) & (c == d) & (a != b)) {
				System.out.println("It's number #2.B");
			} else if ((b == c) & (c == d) & (a != b)) {
				System.out.println("It's number #1.A");
			} else {
				System.out.println("The numbers entered do not match the specified conditions.");
			}
			break;

		case 3:
			int sum;
			System.out.print("Input number A: ");
			a = sc.nextInt();
			System.out.print("Input number B: ");
			b = sc.nextInt();
			System.out.print("Input number C: ");
			c = sc.nextInt();
			// sum = ((a > b) ? ((b > c) ? (a + b) : (a + c)) : ((a > c) ? (a + b) : (b +
			// c))); //Тернарный вариант(трудночитаемый)
			if (a > b) {
				if (b > c) {
					sum = a + b;
				} else {
					sum = a + c;
				}
			} else {
				if (a > c) {
					sum = a + b;
				} else {
					sum = b + c;
				}
			}
			System.out.println("The required amount is " + sum);
			break;

		case 4:
			double x, y, r;
			System.out.print("Input X: ");
			x = sc.nextInt();
			System.out.print("Input Y: ");
			y = sc.nextInt();
			System.out.print("Input RADIUS: ");
			r = sc.nextInt();
			if (r < Math.sqrt(x * x + y * y)) {
				System.out.println("The point does NOT belong to the circle");
			} else {
				System.out.println("The point does belong to the circle");
			}
			break;

		case 5:
			System.out.print("Input number A: ");
			a = sc.nextInt();
			if (a > 0) {
				a += 1;
			} else if (a < 0) {
				a -= 2;
			} else {
				a = 10;
			}
			System.out.println("New value is " + a);
			break;

		case 6:
			int max, min, vg;
			System.out.print("Input number A: ");
			a = sc.nextInt();
			System.out.print("Input number B: ");
			b = sc.nextInt();
			System.out.print("Input number C: ");
			c = sc.nextInt();
			if (a != b && a != c && b != c) {
				if (a > b && a > c) {
					max = a;
					if (b > c) {
						vg = b;
						min = c;
					} else {
						vg = c;
						min = b;
					}
				} else if (b > c && b > a) {
					max = b;
					if (a > c) {
						vg = a;
						min = c;
					} else {
						vg = c;
						min = a;
					}
				} else {
					max = c;
					if (a > b) {
						vg = a;
						min = b;
					} else {
						vg = b;
						min = a;
					}
				}
			} else {
				System.out.println("Part of the entered numbers are equal to each other.");
				break;
			}
			System.out.println("How to sort?");
			System.out.println("1.Ascending\n2.Descending");
			System.out.print("Your choise: ");
			choise = sc.nextInt();
			switch (choise) {
			case 1:
				System.out.println(min + " " + vg + " " + max);
				break;
			case 2:
				System.out.println(max + " " + vg + " " + min);
				break;
			default:
				System.out.println("Incorrect choise");
				break;
			}
			break;

		case 7:
			char vgNum;
			System.out.print("Input number A: ");
			a = sc.nextInt();
			System.out.print("Input number B: ");
			b = sc.nextInt();
			System.out.print("Input number C: ");
			c = sc.nextInt();
			if (a != b && a != c && b != c) {
				if (a > b && a > c) {
					max = a;
					if (b > c) {
						vg = b;
						vgNum = 'B';
						min = c;
					} else {
						vg = c;
						vgNum = 'C';
						min = b;
					}
				} else if (b > c && b > a) {
					max = b;
					if (a > c) {
						vg = a;
						vgNum = 'A';
						min = c;
					} else {
						vg = c;
						vgNum = 'C';
						min = a;
					}
				} else {
					max = c;
					if (a > b) {
						vg = a;
						vgNum = 'A';
						min = b;
					} else {
						vg = b;
						vgNum = 'B';
						min = a;
					}
				}
			} else {
				System.out.println("Part of the entered numbers are equal to each other.");
				break;
			}
			System.out.println("Average number " + vgNum + " = " + vg + ".");
			break;

		case 8:
			double result, resultTrue;
			System.out.print("Input multiplicand: ");
			a = sc.nextInt();
			System.out.print("Input factor: ");
			b = sc.nextInt();
			resultTrue = (int) (a * b);
			System.out.print("Input expected result: ");
			result = sc.nextDouble();
			if (result == resultTrue) {
				System.out.println("Right.");
			} else {
				System.out.println("Wrong. The correct answer is " + (int) resultTrue);
			}
			break;

		case 9:
			int calcOperation;
			System.out.print("Input number A: ");
			a = sc.nextInt();
			System.out.print("Input number B: ");
			b = sc.nextInt();
			System.out.println("Select the required operation:\n\t1.+\n\t2.-\n\t3.*\n\t4./");
			System.out.print("Your choise: ");
			calcOperation = sc.nextInt();
			switch (calcOperation) {
			case 1:
				result = a + b;
				break;
			case 2:
				result = a - b;
				break;
			case 3:
				result = a * b;
				break;
			case 4:
				result = (double) a / b;
				break;
			default:
				System.out.println("Incorrect choise");
				sc.close();
				return;
			}
			if (calcOperation != 4) {
				System.out.println("Result is " + (int) result);
			} else {
				System.out.println("Result is " + result);
			}
			break;
		case 10:
			System.out.println("                         ====%%%%%%%%%%%%%");
			System.out.println("                      %=%%%              %%===%%");
			System.out.println("                    %%  @@@@@@@@@%%%%@      %%%=%");
			System.out.println("                   %% @@                @@%");
			System.out.println("             ::---.%+..---:**+            @@%@");
			System.out.println("         ::--.......---------::**           @@%%");
			System.out.println("       ::-.....----*+++++*---:::::++          @%%%");
			System.out.println("      :--...---+            +*::::::++          @%@");
			System.out.println("     ::-..---:        +===%%+ .+::::**+=");
			System.out.println("     :-------*      ***:  *=%@@:*:::****+");
			System.out.println("    *:---::--+     .===+::==%@@@@*:******+");
			System.out.println("    ::--:::::-+     @@@%%%%%@@@@@@********+");
			System.out.println("     :::::::::::    +@@@@@@@@@ @@@*********+");
			System.out.println("     :*:*::::::::::   @@@@@@@@@@@:**********");
			System.out.println("      :******::::::::*  *@@@@%%%************+");
			System.out.println("       -********************************::::+");
			System.out.println("         **************************::::::::+");
			System.out.println("        ::::*******************:::::::::::++");
			System.out.println("    :-.......--:+*******=-**::::::::::--++");
			System.out.println("  :..---....----::***++***===+--::-*+++");
			System.out.println(" :--------------:::****+++++@");
			System.out.println(" :::::::::::::::::**********+");
			System.out.println(" *************************::+");
			System.out.println("   =******************:::--:+");
			System.out.println("         %+++++++++++++++=");
			break;
		case 11:
			int counter = 1, answer;
			boolean winFlag = false;
			System.out.print("Welcome.\nFrom which number to start the generation: ");
			min = sc.nextInt();
			System.out.print("Specify the upper limit of the generation number: ");
			max = sc.nextInt();
			int value = min + (int) (Math.random() * (max + 1 - min));
			System.out.println(value);
			System.out.println("Generation number produced. You have 3 attempts.\nTry to guess.");

			if (winFlag != true) {// первая попытка
				System.out.print(counter + " try: ");
				answer = sc.nextInt();
				if (answer == value) {
					System.out.println("Congratulations. You won with " + counter + " attempts");
					winFlag = true;
				} else {
					if (counter <= 3) {
						if (answer > value) {
							System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

						} else {
							System.out
									.println("You are mistaken.\nThe guess number is greater than the one you entered");
						}
						counter++;
					}
				}
			}

			if (winFlag != true) {// вторая попытка
				System.out.print(counter + " try: ");
				answer = sc.nextInt();
				if (answer == value) {
					System.out.println("Congratulations. You won with " + counter + " attempts");
					winFlag = true;
				} else {
					if (counter <= 3) {
						if (answer > value) {
							System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

						} else {
							System.out
									.println("You are mistaken.\nThe guess number is greater than the one you entered");
						}
						counter++;
					}
				}
			}

			if (winFlag != true) {// третья попытка
				System.out.print(counter + " try: ");
				answer = sc.nextInt();
				if (answer == value) {
					System.out.println("Congratulations. You won with " + counter + " attempts");
					winFlag = true;
				} else {
					if (counter <= 3) {
						if (answer > value) {
							System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

						} else {
							System.out
									.println("You are mistaken.\nThe guess number is greater than the one you entered");
						}
						counter++;
					}
				}
			}
			if (winFlag != true) {// 4 попытка
				System.out.print(counter + " try: ");
				answer = sc.nextInt();
				if (answer == value) {
					System.out.println("Congratulations. You won with " + counter + " attempts");
					winFlag = true;
				} else {
					if (counter <= 3) {
						if (answer > value) {
							System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

						} else {
							System.out
									.println("You are mistaken.\nThe guess number is greater than the one you entered");
						}
						counter++;
					}
				}
			}
			if (winFlag != true) {// 5 попытка
				System.out.print(counter + " try: ");
				answer = sc.nextInt();
				if (answer == value) {
					System.out.println("Congratulations. You won with " + counter + " attempts");
					winFlag = true;
				} else {
					if (counter <= 3) {
						if (answer > value) {
							System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

						} else {
							System.out
									.println("You are mistaken.\nThe guess number is greater than the one you entered");
						}
						counter++;
					}
				}
			}
			if (winFlag != true) {// 6 попытка
				System.out.print(counter + " try: ");
				answer = sc.nextInt();
				if (answer == value) {
					System.out.println("Congratulations. You won with " + counter + " attempts");
					winFlag = true;
				} else {
					if (counter <= 3) {
						if (answer > value) {
							System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

						} else {
							System.out
									.println("You are mistaken.\nThe guess number is greater than the one you entered");
						}
						counter++;
					}
				}
			}
			if (winFlag != true) {// 7 попытка
				System.out.print(counter + " try: ");
				answer = sc.nextInt();
				if (answer == value) {
					System.out.println("Congratulations. You won with " + counter + " attempts");
					winFlag = true;
				} else {
					if (counter <= 3) {
						if (answer > value) {
							System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

						} else {
							System.out
									.println("You are mistaken.\nThe guess number is greater than the one you entered");
						}
						counter++;
					}
				}
			}
			if (winFlag != true) {// 8 попытка
				System.out.print(counter + " try: ");
				answer = sc.nextInt();
				if (answer == value) {
					System.out.println("Congratulations. You won with " + counter + " attempts");
					winFlag = true;
				} else {
					if (counter <= 3) {
						if (answer > value) {
							System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

						} else {
							System.out
									.println("You are mistaken.\nThe guess number is greater than the one you entered");
						}
						counter++;
					}
				}
			}
			if (winFlag != true) {// 9 попытка
				System.out.print(counter + " try: ");
				answer = sc.nextInt();
				if (answer == value) {
					System.out.println("Congratulations. You won with " + counter + " attempts");
					winFlag = true;
				} else {
					if (counter <= 3) {
						if (answer > value) {
							System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

						} else {
							System.out
									.println("You are mistaken.\nThe guess number is greater than the one you entered");
						}
						counter++;
					}
				}
			}
			if (winFlag != true) {// 10 попытка
				System.out.print(counter + " try: ");
				answer = sc.nextInt();
				if (answer == value) {
					System.out.println("Congratulations. You won with " + counter + " attempts");
					winFlag = true;
				} else {
					if (counter <= 3) {
						if (answer > value) {
							System.out.println("You are mistaken.\nThe guess number is less than the one you entered");

						} else {
							System.out
									.println("You are mistaken.\nThe guess number is greater than the one you entered");
						}
						counter++;
					}
				}
			}

			if (counter > 10) {
				System.out.print("Your attempts have ended.");
			}
			break;
		default:
			break;
		}
		sc.close();
	}

}
