import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int peca1, peca2;
		int numPeca1, numPeca2;
		double valorPeca1, valorpeca2;

		peca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();

		peca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorpeca2 = sc.nextDouble();

		double calculo = (numPeca1 * valorPeca1) + (numPeca2 * valorpeca2);

		System.out.printf("VALOR A PAGAR: R$ %.2f", calculo);

		sc.close();

	}

}
