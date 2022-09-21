package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConvertor;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConvertor convertor = new CurrencyConvertor();
		
		System.out.print("What is the dollar price?");
		double dolar = sc.nextDouble();
		System.out.print("How many dollar will be bought?");
		double reais = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n",  CurrencyConvertor.reais(dolar, reais));
		
		

	}

}
