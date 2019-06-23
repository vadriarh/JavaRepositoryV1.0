package services;

import java.util.Date;

import model.Account;
import model.Client;
import model.Employee;

public class AccountServices {
	public static boolean withdraw(Client client, double amount) {
		System.out.println(new Date() + " withdraw() -> Amount: " + amount + " -> Client ID: " + client.getUid());
		if (amount <= client.getAccount().getBalance()) {
			client.getAccount().setBalance(client.getAccount().getBalance() - amount);
			System.out.println("Success withdraw.");
			return true;
		} else {
			System.out.println("Balance < withdraw amount.");
			return false;
		}

	}

	public static void deposite(Client client, double amount) {
		System.out.println(new Date() + " deposite() -> Amount: " + amount + " -> Client ID: " + client.getUid());
		client.getAccount().setBalance(client.getAccount().getBalance() + amount);
		System.out.println("Success deposite.");
	}

	public static void transfer(Client clFrom, Client clTo, double amount) {
		System.out.println(new Date() + " transfer() -> Amount: " + amount + " -> From Client ID: " + clFrom.getUid()
				+ " -> To Client ID: " + clTo.getUid());
		if (withdraw(clFrom, amount)) {
			deposite(clTo, amount);
			System.out.println("Success transfer.");
		}
	}

	public static void transferSalary(Account from, Employee[] to) {
		System.out.println(new Date() + " transfer() -> To Employee: ");
		for (int i = 0; i < to.length; i++) {
			System.out.println(
					new Date() + " transfer() -> Salary: " + to[i].getSalary() + " -> To Client ID: " + to[i].getUid());
			if (to[i].getSalary() <= from.getBalance()) {
				from.setBalance(from.getBalance() - to[i].getSalary());
				System.out.println("Success salary.");
			} else {
				System.out.println("Balance < salary.");
				continue;
			}
			deposite(to[i], to[i].getSalary());
			System.out.println("Success transfer.");
		}
	}

}
