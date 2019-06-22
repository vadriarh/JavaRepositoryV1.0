package model;

public class Client {
	private long uid;
	private String name;
	private String surname;
	private Account account;

	@Override
	public String toString() {
		return "Client [uid=" + uid + ", name=" + name + ", surname=" + surname + ", account=" + account + "]";
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Client(long uid, String name, String surname) {
		super();
		this.uid = uid;
		this.name = name;
		this.surname = surname;
	}

	public Client(long uid, String name, String surname, Account account) {
		this(uid, name, surname);
		this.account = account;
	}

}
