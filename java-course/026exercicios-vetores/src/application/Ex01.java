package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		if (vect.length <= 10) {

			for (int i = 0; i < vect.length; i++) {
				System.out.print("Digite um número: ");
				vect[i] = sc.nextInt();
			}

			System.out.println("Números negativos:");

			for (int i = 0; i < vect.length; i++) {

				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}

		} else {

			System.out.println("Insira um número entre 1 e 10.");
		}

		sc.close();

	}

}
