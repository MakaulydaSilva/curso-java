package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		int pares = 0;
		int numPares = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		for (int i = 0; i < vect.length; i++) {

			if (vect[i] % 2 == 0) {
				pares += vect[i];

				numPares++;
			}
		}

		double mediaPares = (double) pares / numPares;

		if (pares == 0) {
			System.out.println("Nenhum número par.");

		} else {
			System.out.printf("Média dos pares = %.2f", mediaPares);
		}

		sc.close();

	}

}
