package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolderName = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");

		String initialDepositYN = (sc.nextLine());
		double initialDeposit;

		Account account;

		if (initialDepositYN.equalsIgnoreCase("Y")) {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, accountHolderName, initialDeposit);

			account.accountData(account);

			account.deposit(account, sc);
			account.withdraw(account, sc);

		} else {
			account = new Account(accountNumber, accountHolderName);

			account.accountData(account);

			account.deposit(account, sc);
			account.withdraw(account, sc);
		}

		sc.close();
	}

}
