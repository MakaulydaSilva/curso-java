import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int combustiveis = sc.nextInt();

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (combustiveis != 4) {

			if (combustiveis == 1) {
				alcool += 1;
			} else if (combustiveis == 2) {
				gasolina += 1;
			} else if (combustiveis == 3) {
				diesel += 1;
			}
			
			combustiveis = sc.nextInt();
		}

		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
