package glava6;

import java.util.ArrayList;

public class ArrayListMagnet {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "����");
		a.add(1, "����");
		a.add(2, "���");
		a.add(3, "���");
		printAl(a);
		a.remove(2);
		if (a.contains("���")) {
			a.add("������");
		}
		printAl(a);
		if(a.indexOf("������")!=4) {
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
