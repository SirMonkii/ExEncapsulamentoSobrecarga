package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número da conta ");
		int numConta = sc.nextInt();

		System.out.print("Nome do titular ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Depósito incial? ");

		String depositoYN = (sc.nextLine());
		double valores;

		Account account = null;

		// Nesse if eu coloquei os métodos .toUpperCase e .equals pra pegar o valor Y
		// independente do usuário passar em letra maiúscula ou minúscula
		if (depositoYN.toUpperCase().equals("Y")) {

			System.out.print("Enter initial deposit value: ");
			valores = sc.nextDouble();
			account = new Account(numConta, name, valores);

			System.out.println();
			System.out.println("Account data:");
			System.out.println(account);
			System.out.println();

			System.out.print("Enter a deposit value: ");
			valores = sc.nextDouble();
			account.deposito(valores);
			System.out.println("Update account data:");
			System.out.println(account);

			System.out.println();
			System.out.print("Enter a withdraw value: ");
			valores = sc.nextDouble();
			account.saque(valores);
			System.out.println("Update account data:");
			System.out.println(account);

		} else {
			account = new Account(numConta, name);

			System.out.println();
			System.out.println("Account data:");
			System.out.println(account);
			System.out.println();

			System.out.print("Enter a deposit value: ");
			valores = sc.nextDouble();
			account.deposito(valores);
			System.out.println("Update account data:");
			System.out.println(account);

			System.out.println();
			System.out.print("Enter a deposit value: ");
			valores = sc.nextDouble();
			account.saque(valores);
			System.out.println("Update account data:");
			System.out.println(account);
		}

		sc.close();
	}

}