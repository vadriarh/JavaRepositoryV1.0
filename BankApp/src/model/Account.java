package model;

public class Account {
	private double balance;
	private String accNum;
	private String curType;

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accNum=" + accNum + ", curType=" + curType + "]";
	}

	public String getAccId() {
		return accNum;
	}

	public void setAccId(String accId) {
		this.accNum = accId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCurType() {
		return curType;
	}

	public void setCurType(String curType) {
		this.curType = curType;
	}

	public Account(double balance, String accId, String curType) {
		this(accId, curType);
		this.accNum = accId;
	}

	public Account(String accId, String curType) {
		super();
		this.accNum = accId;
		this.curType = curType;
	}
}
