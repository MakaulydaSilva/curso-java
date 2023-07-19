import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;

		double codigo = sc.nextDouble();
		double quantidade = sc.nextDouble();

		double calculo = 0;

		if (codigo == 1) {
			calculo = cachorroQuente * quantidade;
		} else if (codigo == 2) {
			calculo = xSalada * quantidade;
		} else if (codigo == 3) {
			calculo = xBacon * quantidade;
		} else if (codigo == 4) {
			calculo = torradaSimples * quantidade;
		} else if (codigo == 5) {
			calculo = refrigerante * quantidade;
		} else {
			System.out.println("Insira um número entre 1 e 5");
		}

		System.out.printf("Total: R$ %.2f", calculo);

		sc.close();

	}

}
