package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Ex03Pessoas;

public class Ex03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		Ex03Pessoas[] vect = new Ex03Pessoas[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			String pessoa = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vect[i] = new Ex03Pessoas(pessoa, idade, altura);
		}

		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {
			soma = soma + vect[i].getAltura();
		}

		double media = soma / n;

		System.out.printf("Altura média: %.2f%n", media);

		double idade16anos = 0.0;

		for (int i = 0; i < vect.length; i++) {

			if (vect[i].getIdade() < 16) {
				idade16anos = i++;
			}
		}

		idade16anos = idade16anos / vect.length * 100;

		System.out.println("Pessoas com menos de 16 anos: " + idade16anos + "%");

		for (int i = 0; i < vect.length; i++) {

			if (vect[i].getIdade() < 16) { 
				System.out.println(vect[i].getPessoa());
			}
		}

		sc.close();

	}

}
