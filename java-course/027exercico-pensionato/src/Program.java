import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pensionato[] vetor = new Pensionato[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent  #" + i + ":");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int numberRoom = sc.nextInt();

			vetor[numberRoom] = new Pensionato(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms:");

		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + vetor[i].toString());
			}
		}

		sc.close();
	}

}
