package less02;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program calculates the " + "electrical characteristics of metal wire.");
		final double RESISTIVITY_OF_COPPER = 1.7e-8; // Объявление и инициализация констант
		final double RESISTIVITY_OF_ALUMINUM = 2.53e-8;
		final double RESISTIVITY_OF_UNKNOWN_METAL; // Предварительное объявление константы
		double wireResistance, wireGauge, wireLength; // Переменные, обозначающие характеристики провода

		System.out.print("Enter wire resistance of the wire in ohms: ");
		wireResistance = sc.nextDouble();
		System.out.print("Enter wire length of the wire in meters: ");
		wireLength = sc.nextDouble();
		wireGauge = (RESISTIVITY_OF_COPPER * wireLength) / wireResistance;
		System.out.println("Copper wire cross section must be no more " + wireGauge + " sq meter or "
				+ (wireGauge * 10000) + " sq mm.");
		System.out.println("Aluminum wire cross section must be no more "
				+ ((RESISTIVITY_OF_ALUMINUM * wireLength) / wireResistance) + " sq meter or "
				+ (((RESISTIVITY_OF_ALUMINUM * wireLength) / wireResistance) * 10000) + " sq mm."); // Расчет результата
																									// в форме вывода
																									// без перезаписи
																									// переменной
																									// wireGauge
		RESISTIVITY_OF_UNKNOWN_METAL = (wireResistance * 0.001) / wireLength;// Инициализация константы
		System.out.println("The resistivity for an unknown metal with a cross section of 10 sq. mm is "
				+ RESISTIVITY_OF_UNKNOWN_METAL + ".");// Здесь было взято значение wireGauge =0,001
		sc.close();
	}

}
