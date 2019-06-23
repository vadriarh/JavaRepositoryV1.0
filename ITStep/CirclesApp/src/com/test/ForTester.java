package com.test;

public class ForTester {

	public static void main(String[] args) {

		// for(<init> ;<condition>;<iter>)
		// <init> - I. происходит единожды,и эти переменные доступные в теле цикла for
		// //не об€зателен
		// <condition>-II. ѕосле инициализации сразу происходит проверка услови€. ≈сли
		// TRUE - выполн€етс€ BODY цикла. »наче - пропустит BODY цикла.
		// <iter> - III. ѕосле Body выполн€етс€ итераци€ //Ќе об€зателен
		// V. check condition
		for (int i = 0; i < 20; i++) {
			// System.out.println((i+1)+" make salat");
		}
		for (; (int) (Math.random() * 11) != 5;) {
			System.out.println("OK!");
		}
	}
}
