package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();

		String[] vetorPessoa = new String[n];
		int[] vetorIdade = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			vetorPessoa[i] = sc.next();
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();
		}

		int idade = vetorIdade[0];
		String pessoa = vetorPessoa[0];

		for (int i = 0; i < n; i++) {

			if (vetorIdade[i] > idade) {

				idade = vetorIdade[i];
				pessoa = vetorPessoa[i];
			}
		}

		System.out.println("Pessoa mais velha: " + pessoa + " com " + idade + " anos.");

		sc.close();

	}

}
