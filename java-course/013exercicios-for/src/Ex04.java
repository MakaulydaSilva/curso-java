//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int par1 = sc.nextInt();
			int par2 = sc.nextInt();

			if (par2 == 0) {
				System.out.println("Divisão impossível");

			} else {
				double divisao = (double) par1 / par2;
				System.out.println(divisao);
			}
		}

		sc.close();

	}

}
