import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++)  {
			
			float n1 = sc.nextFloat();
			float n2 = sc.nextFloat();
			float n3 = sc.nextFloat();
			
			double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
					
			System.out.printf( "%.1f%n", media);
			
			
		}
		
		sc.close();

	}

}
