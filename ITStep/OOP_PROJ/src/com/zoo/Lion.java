package com.zoo;

public class Lion extends Cat {// "is the" relationship
	boolean isKing;
	boolean isSingle;

	@Override
	public String toString() {
		return "Lion [isKing=" + isKing + ", isSingle=" + isSingle + ", weight=" + weight + ", isWild=" + isWild
				+ ", numOfLives=" + numOfLives + ", name=" + name + ", age=" + age + "]";
	}

//Overloading-���������� ������.��������� ������� ���������.��������� ����� ����� ������ ������������ ������. ��������� ������ �� ������ ��������� � ����� ��������������(����� ������������, � ��������� �� �����������)
	public String toString(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(toString().toUpperCase());
		}
		return "Lion [isKing=" + isKing + ", isSingle=" + isSingle + ", weight=" + weight + ", isWild=" + isWild
				+ ", numOfLives=" + numOfLives + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public void eat() {
		System.out.println("Lion -> eat()");
		
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
