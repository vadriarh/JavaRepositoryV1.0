package glava3;

public class TestArrays {

	public static void main(String[] args) {

		String[] islands = new String[4];
		int[] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		islands[0] = "�������";
		islands[1] = "�����";
		islands[2] = "�������� �������";
		islands[3] = "��������";

		int y = 0;

		while (y < 4) {
			int ref;
			ref = index[y];
			System.out.println(islands[ref]);
			y = y + 1;
		}

	}

}
