package com.homework7.oop.task4;

import java.util.*;
import java.text.*;

public class Person {
	private String name;
	private Date birthday;
	private String nickname;
	private List<Address> addresses;
	private List<Phone> phoneNumbers;

	public void setDate(String birthday) throws ParseException {
		SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
		this.birthday = ft.parse(birthday);
	}

	public Date getDate(Date birthday) {
		return this.birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Phone> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Phone> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public void setPerson(String name, String nickname, String birthday) throws ParseException {
		setName(name);
		setNickname(nickname);
		setDate(birthday);
	}

	public static Person[] generatedAndInitBaseOfPerson(int num) {
		Person baseReturn[] = new Person[num];
		for (int i = 0; i < baseReturn.length; i++) {
			baseReturn[i] = new Person();

		}
		return baseReturn;

	}
}
