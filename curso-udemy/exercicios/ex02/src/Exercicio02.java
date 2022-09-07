import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero01 = sc.nextInt();
		int numero02 = sc.nextInt();
		
		int soma = numero01 + numero02;
		
		System.out.println("SOMA = " + soma);
		
		
		sc.close();
		

	}

}
