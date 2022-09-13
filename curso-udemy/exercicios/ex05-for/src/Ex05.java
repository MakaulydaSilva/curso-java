import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i <= n ; i++) {
			
			if(n != 0) {
				n = n * (n-1) * (n-2) * (n-3) * 1;
			}
			else {
				n = 1;
			}
		}
		
		sc.close();

	}

}
