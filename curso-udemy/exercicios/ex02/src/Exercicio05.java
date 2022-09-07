import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int numFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double salarioHora = sc.nextDouble();
		double salarioMensal = horasTrabalhadas * salarioHora;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARIO = U$ %.2f%n", salarioMensal);
		
		
		sc.close();

	}

}
