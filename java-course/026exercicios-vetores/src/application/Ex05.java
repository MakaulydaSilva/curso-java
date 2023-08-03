package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double vect[] = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		double maiorValor = vect[0];
		double posicaoMaior = 0;

		for (int i = 0; i < vect.length; i++) {

			if (vect[i] > maiorValor) {
				maiorValor = vect[i];

				posicaoMaior = i;
			}
		}

		System.out.println();
		System.out.printf("Maior valor = %.1f%n", maiorValor);
		System.out.println("Posição do maior valor = " + posicaoMaior);

		sc.close();

	}

}
