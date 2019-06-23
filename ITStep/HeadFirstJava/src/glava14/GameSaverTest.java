package glava14;

import java.io.*;

public class GameSaverTest {

	public static void main(String[] args) {
		GameCharacter one=new GameCharacter(50, "����", new String[] {"���","���","������"});
		GameCharacter two=new GameCharacter(200, "�����", new String[] {"����� ����","������� �����"});
		GameCharacter three=new GameCharacter(120, "���", new String[] {"����������","�����������"});
		
		try {
			ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("Game.ser"));
		os.writeObject(one);
		os.writeObject(two);
		os.writeObject(three);
		os.close();
		
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		one=null;
		two=null;
		three=null;
		
		try {
			ObjectInputStream is=new ObjectInputStream(new FileInputStream("Game.ser"));
			GameCharacter oneRestore=(GameCharacter)is.readObject();
			GameCharacter twoRestore=(GameCharacter)is.readObject();
			GameCharacter threeRestore=(GameCharacter)is.readObject();
			
			
			System.out.println("��� �������: "+oneRestore.getType());
			System.out.println("��� �������: "+twoRestore.getType());
			System.out.println("��� ��������: "+threeRestore.getType());
		
			is.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
	}

}
