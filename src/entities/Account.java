package entities;

import java.util.Scanner;

public class Account {

	private int accountNumber;
	private String accountHolderName;
	private double balance, values;

	public Account() {

	}

	public Account(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public Account(int accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void accountData(Account account) {
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();

	}

	public void depositLogic(double depositValue) {
		balance += depositValue;
	}

	public void deposit(Account account, Scanner sc) {
		System.out.print("Enter a deposit value: ");
		values = sc.nextDouble();
		account.depositLogic(values);
		System.out.println("Update account data:");
		System.out.println(account);
	}

	public void withdrawLogic(double withdrawValue) {
		balance -= (withdrawValue + 5);
	}

	public void withdraw(Account account, Scanner sc) {
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		values = sc.nextDouble();
		account.withdrawLogic(values);
		System.out.println("Update account data:");
		System.out.println(account);

	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + accountHolderName + ", Balance: $"
				+ String.format("%.2f", balance);
	}
}
