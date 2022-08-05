import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int peca1 = sc.nextInt();
		int numPecas1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		int peca2 = sc.nextInt();
		int numPecas2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double totalPrecoPecas = (numPecas1 * valorPeca1 + numPecas2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPrecoPecas);
		
		sc.close();
		
		
		
		
		

	}

}
