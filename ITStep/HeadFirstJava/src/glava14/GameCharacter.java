package glava14;

import java.io.*;

public class GameCharacter implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 123925538101868036L;
	int power;
	String type;
	String[] weapons;
	
	public GameCharacter(int power, String type, String[] weapons) {

		this.power = power;
		this.type = type;
		this.weapons = weapons;
	}

	public int getPower() {
		return power;
	}

	public String getType() {
		return type;
	}

	public String[] getWeapons() {
		String weaponList="";
		for (String weapon : weapons) {
			weaponList.concat(weapon).concat(" ");
		}
		return weapons;
	}


}
