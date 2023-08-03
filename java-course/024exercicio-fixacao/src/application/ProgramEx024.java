package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramEx024 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();

		System.out.print("Enter account holder: ");
		String holderAccount = sc.next();
		
		sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {

			System.out.print("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(numberAccount, holderAccount, initialDeposit);

		} else {

			account = new Account(numberAccount, holderAccount);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.print(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.print(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.print(account);
		
		sc.close();

	}

}
