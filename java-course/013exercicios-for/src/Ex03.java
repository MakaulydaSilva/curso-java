//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
//peso 5

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double valor1 = 0;
		double valor2 = 0;
		double valor3 = 0;

		for (int i = 0; i < N; i++) {

			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();

			double media = (2 * valor1 + 3 * valor2 + 5 * valor3) / 10;

			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}
