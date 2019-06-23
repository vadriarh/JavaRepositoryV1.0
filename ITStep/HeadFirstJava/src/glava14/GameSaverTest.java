package glava14;

import java.io.*;

public class GameSaverTest {

	public static void main(String[] args) {
		GameCharacter one=new GameCharacter(50, "Эльф", new String[] {"Лук","Меч","Кастет"});
		GameCharacter two=new GameCharacter(200, "Троль", new String[] {"Голые руки","Большой топор"});
		GameCharacter three=new GameCharacter(120, "Маг", new String[] {"Заклинания","Невидимость"});
		
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
			
			
			System.out.println("Тип первого: "+oneRestore.getType());
			System.out.println("Тип второго: "+twoRestore.getType());
			System.out.println("Тип третьего: "+threeRestore.getType());
		
			is.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
	}

}
