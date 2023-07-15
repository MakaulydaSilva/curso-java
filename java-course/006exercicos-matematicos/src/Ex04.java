import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroDoFuncionario;
		int horasTrabalhadas;
		double totalHorasTrabalhadas;

		numeroDoFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		totalHorasTrabalhadas = sc.nextDouble();

		double calculoSalario = horasTrabalhadas * totalHorasTrabalhadas;

		System.out.println("NUMBER = " + numeroDoFuncionario);
		System.out.printf("SALARY = U$ %.2f", calculoSalario);

		sc.close();

	}

}
