package pack1;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		int example = 0;
		int[] arrSample;
		Scanner sc = new Scanner(System.in);
		System.out.print("Examples:\n\t1.Variables\n\t2.Model\n\t3.Search 4 elem\n\t4.Generate for circle"
				+ "\n\t5.Generate random numbers for circle\n\t6.Create arrays\n\t7.Generate arrays\nYour choose: ");
		
		while (sc.hasNextInt()) {
			example = sc.nextInt();
			if (example > 0 && example < 10) {
				break;
			} else {
				System.out.println("Incorrect choose. Input your choose: ");
				continue;
			}
		}
		switch (example) {
		case 1:
			Variables.example(10, 8.4, "No", true);
			break;
			
		case 2:
			Person p1 = new Person(24, 84.5, "Mike", true);
			System.out.println(p1);
			
			Car c1 = new Car(20000, 1545.6, "BMW", false);
			System.out.println(c1);
			break;
			
		case 3:
			System.out.println(IfAndCircle.searchMin(14, 54, 88, 1));
			System.out.println(IfAndCircle.searchMax(14, 54, 88, 1));
			break;
			
		case 4:
			IfAndCircle.printFor(1005, 5, 20);
			IfAndCircle.printWhile(1005, 5, 20);

			IfAndCircle.printFor(999, -100, 10);
			IfAndCircle.printWhile(999, -100, 10);
			
			IfAndCircle.printFor(22, 22, 50);
			IfAndCircle.printWhile(22, 22, 50);
			break;
			
		case 5:
			IfAndCircle.printForRandom(0, 200, 20, 	false, false, false);
			IfAndCircle.printWhileRandom(0, 200, 20, false, false, false);
			
			IfAndCircle.printForRandom(0, 20, 10, true, true, false);
			IfAndCircle.printWhileRandom(0, 20, 10, true, true, false);
			
			IfAndCircle.printForRandom(20, 50, 20, false, false, true);
			IfAndCircle.printWhileRandom(20, 50, 20, false, false, true);
			break;
			
		case 6:
			Utils.printArray(Arrays.example1(-10, 3, 10));
			Utils.printArray(Arrays.example2("A", 10));
			Utils.printArray(Arrays.example3(-10, 2, 10));
			break;
		case 7:
			Utils.printArray(Arrays.generateRandomNumber(0, 200, 10));
			
			arrSample = Arrays.generateRandomNumber(20, 50, 20);
			Utils.printArray(arrSample);
			System.out.println(Arrays.searchMinArray(arrSample));
			System.out.println(Arrays.searchMaxArray(arrSample));
			System.out.println(Arrays.avg(arrSample));
			
			arrSample = Arrays.generateRandomNumber(20, 50, 20);
			Utils.printArray(arrSample);
			arrSample = Arrays.sortArray(arrSample);
			Utils.printArray(arrSample);

		}

		sc.close();
	}

	
}
