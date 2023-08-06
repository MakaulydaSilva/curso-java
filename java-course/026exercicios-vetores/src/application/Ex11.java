package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		double[] vetorAltura = new double[n];
		char[] vetorSexo = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa:");
			vetorAltura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "ª pessoa:");
			vetorSexo[i] = sc.next().charAt(0);
		}

		double maiorAltura = vetorAltura[0];
		double menorAltura = vetorAltura[0];
		int numeroHomens = 0;
		int numeroMulheres = 0;
		double alturaFemTotal = 0.0;

		for (int i = 0; i < n; i++) {

			if (vetorAltura[i] < menorAltura) {
				menorAltura = vetorAltura[i];
			}

			if (vetorAltura[i] > maiorAltura) {
				maiorAltura = vetorAltura[i];
			}

			if (vetorSexo[i] == 'M') {
				numeroHomens++;

			} else {
				numeroMulheres++;
				alturaFemTotal += vetorAltura[i];
			}
		}

		double mediaAlturaMulheres = alturaFemTotal / numeroMulheres;

		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.println("Número de homens = " + numeroHomens);

		sc.close();

	}

}
