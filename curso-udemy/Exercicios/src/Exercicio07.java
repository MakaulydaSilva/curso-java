import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		
		
		float triangulo = A * C / 2; //a
		float retangulo = A * B; //e
		double circulo = Math.PI * C * C;
		double trapezio = (A + B) / 2.0 * C;
		float quadrado = B * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n",  circulo);
		System.out.printf("TRAPEZIO: %.3f%n",  trapezio);
		System.out.printf("QUADRADO: %.3f%n",  quadrado);
		System.out.printf("RETANGULO: %.3f%n",  retangulo);
		
		sc.close();

	}

}
