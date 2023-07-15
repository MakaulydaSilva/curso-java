import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int z;
		double y;
		char a;

		x = sc.next(); // String
		z = sc.nextInt(); // Números inteiros
		y = sc.nextDouble(); // Números com pontos flutuantes
		a = sc.next().charAt(0); // Caractere

		System.out.printf("Você digitou: " + x + " , o caractere " + a + ", o número: " + z + " e o outro número: %.2f",
				y);

		// ------------------------------------------------------------------------

		String nome;
		int num1;
		double num2;

		nome = sc.next();
		num1 = sc.nextInt();
		num2 = sc.nextDouble();

		System.out.println("Dados digitados:");
		System.out.println(nome);
		System.out.println(num1);
		System.out.println(num2);

		sc.close();

	}

}
