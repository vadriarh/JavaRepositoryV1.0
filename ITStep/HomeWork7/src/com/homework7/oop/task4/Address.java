package com.homework7.oop.task4;

public class Address {
	private String name;
	private String street;
	private String sity;
	private String state;
	private Zipcode zipcode;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getStreet() {
		return street;
	}

	void setStreet(String street) {
		this.street = street;
	}

	String getSity() {
		return sity;
	}

	void setSity(String sity) {
		this.sity = sity;
	}

	String getState() {
		return state;
	}

	void setState(String state) {
		this.state = state;
	}

	Zipcode getZipcode() {
		return zipcode;
	}

	void setZipcode(String zipcode) {
		this.zipcode.setZipcode(zipcode);
	}

	@SuppressWarnings("null")
	public static Address setAddress(String name, String street, String sity, String state, String zipcode) {
		Address address = new Address();
		address.setName(name);
		address.setStreet(street);
		address.setSity(sity);
		address.setState(state);
		address.setZipcode(zipcode);
		return address;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", street=" + street + ", sity=" + sity + ", state=" + state + ", zipcode="
				+ zipcode + ", toString()=" + super.toString() + "]";
	}
}
