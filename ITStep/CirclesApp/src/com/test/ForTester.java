package com.test;

public class ForTester {

	public static void main(String[] args) {

		// for(<init> ;<condition>;<iter>)
		// <init> - I. ���������� ��������,� ��� ���������� ��������� � ���� ����� for
		// //�� ����������
		// <condition>-II. ����� ������������� ����� ���������� �������� �������. ����
		// TRUE - ����������� BODY �����. ����� - ��������� BODY �����.
		// <iter> - III. ����� Body ����������� �������� //�� ����������
		// V. check condition
		for (int i = 0; i < 20; i++) {
			// System.out.println((i+1)+" make salat");
		}
		for (; (int) (Math.random() * 11) != 5;) {
			System.out.println("OK!");
		}
	}
}
