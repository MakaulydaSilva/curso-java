package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Ex10Notas;

public class Ex10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		Ex10Notas[] vetor = new Ex10Notas[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();

			vetor[i] = new Ex10Notas(nome, nota1, nota2);
		}

		System.out.println("Alunos aprovados: ");

		for (int i = 0; i < vetor.length; i++) {
			double media = vetor[i].media();

			if (media >= 6.00) {
				System.out.println(vetor[i].getNomeAluno());
			}
		}

		sc.close();

	}

}
