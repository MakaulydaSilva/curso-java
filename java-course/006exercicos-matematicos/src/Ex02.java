import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double pi = 3.14159;
		double raio;
		
		raio = sc.nextDouble();
		
		double resultado = pi * Math.pow(raio, 2);
		
		System.out.printf("A= %.4f", resultado);
		
		sc.close();
	}

}
