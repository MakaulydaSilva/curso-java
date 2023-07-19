import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto2 = 1000 * 8 / 100;

		if (salario > 0.00 && salario <= 2000.00) {
			System.out.println("Isento");

		} else if (salario >= 2000.01 && salario <= 3000.00) {
			double imposto1 = (salario - 2000.00) * 8 / 100;
			System.out.printf("R$ %.2f", imposto1);

		} else if (salario >= 3000.01 && salario < 4500.00) {
			double extra1 = (salario - 3000.00) * 18 / 100;
			double total1 = imposto2 + extra1;
			System.out.printf("R$ %.2f", total1);

		} else if (salario > 4500.00) {
			double extra2 = 1500.00 * 18 / 100;
			double extra3 = (salario - 4500.00) * 28 / 100;
			double total2 = imposto2 + extra2 + extra3;
			System.out.printf("R$ %.2f", total2);
		}

		sc.close();

	}

}
