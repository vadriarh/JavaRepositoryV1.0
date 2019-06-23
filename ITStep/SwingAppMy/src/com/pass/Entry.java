package com.pass;

public class Entry {
	private String name;// gmail.com
	private String login;//
	private String password;//

	public Entry(String name, String login, String password, String password2) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
		this.password2 = password2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	private String password2;//
}
