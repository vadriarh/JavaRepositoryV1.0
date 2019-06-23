package less02;

import java.util.Scanner;

public class Var {
	public static void main(String[] args) {
		// Variable Declaration
		// <type_of_var> <name_of_var>;
		int i;
		int temp;

		// Variable Initialization
		// <name_of_var> = <literal>;
		i = 55;

		System.out.println(i);

		// Declaration and Initialization
		int z = 66;
		// save z
		temp = z;
		z = 33;

		System.out.println("Original Value = " + temp);
		System.out.println("New Value = " + z);

		System.out.println();

		System.out.print("Some str");
		System.out.print("Some str2\\n");
		System.out.println("Some str3");

		System.out.println("Task #1");
//		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number a = ");
		int a = sc.nextInt();

		System.out.print("Input Number b = ");
		int b = sc.nextInt();

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));

		int a2 = 3, b2 = 7;
		double div = a2 / (double) b2;
		System.out.println("DIV = " + div);

		int result = a2 % b2;
		System.out.println("Result = " + result);

		System.out.print("Input Number(Integer) = ");
		int input = sc.nextInt();
		System.out.println("User input is " + input);

		sc.close();
//		String name = "Vadim";
	}

}
