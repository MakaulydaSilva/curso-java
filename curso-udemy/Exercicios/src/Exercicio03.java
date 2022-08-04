import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double resultado =  Math.sqrt(Math.PI);
		
		resultado = sc.nextDouble();
		
	 System.out.println("A = " + resultado);
		
		
		
		
		

		
		sc.close();
	}

}
