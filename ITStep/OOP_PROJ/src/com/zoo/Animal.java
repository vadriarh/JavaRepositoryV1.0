package com.zoo;

public abstract class Animal implements Eatable,Cloneable,Comparable<Animal>{
	String name;
	int age;

	@Override // ��������������� ������ ������������� ������. ������������ ������� �����
				// ��������� ������.
	// ���� ��������� ��������� ��� ��������� � ������������� .
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}


}
