// Insira um número de 1 a 1000 para obter os números impares em sequência decrescente

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		int soma = 1;

		for (int i = 0; i < X; i++) {

			soma = Math.abs(i - X);

			if (!(soma % 2 == 0) && (X >= 1 && X <= 1000)) {

				System.out.println(soma);

			}

		}

		if (X < 1 || X > 1000) {

			System.out.println("Insira um número entre 1 e 1000.");
		}

		sc.close();
	}

}
