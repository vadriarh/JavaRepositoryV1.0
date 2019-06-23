package com.homework7.oop.task4;

import java.text.ParseException;
import java.util.List;

public class Client {

	@SuppressWarnings("null")
	public static void main(String[] args) throws ParseException {

		// TODO Auto-generated method stub
		Person base[] = Person.generatedAndInitBaseOfPerson(5);
		base[0].setPerson("Alex", "Stone", "23.11.1987");

		Address base_0_1 = Address.setAddress("3", "Baker St", "Luton", "LU1", "3PX");
		List<Address> base_0 = null;
		base_0.add(base_0_1);
		base[0].setAddresses(base_0);

	}

}
