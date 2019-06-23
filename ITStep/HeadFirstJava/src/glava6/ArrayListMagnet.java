package glava6;

import java.util.ArrayList;

public class ArrayListMagnet {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "ноль");
		a.add(1, "один");
		a.add(2, "два");
		a.add(3, "три");
		printAl(a);
		a.remove(2);
		if (a.contains("три")) {
			a.add("четыре");
		}
		printAl(a);
		if(a.indexOf("четыре")!=4) {
			a.add(4,"4.2");
		}
		printAl(a);
		printAl(a);

	}

	public static void printAl(ArrayList<String> el) {
		for (String element : el) {
			System.out.print(element + " ");
		}
		System.out.println();

	}

}
