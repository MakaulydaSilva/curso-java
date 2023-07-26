package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class ProgramEx {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("What is the dollar price? ", CurrencyConverter.dollarPrice);
		CurrencyConverter.dollarPrice = sc.nextDouble();

		System.out.printf("How many dollars will be bought? ", CurrencyConverter.dollarBought);
		CurrencyConverter.dollarBought = sc.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.paidInReais());

		sc.close();

	}

}
