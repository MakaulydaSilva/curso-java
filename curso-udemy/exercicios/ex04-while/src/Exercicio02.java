import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("1º Quadrante");
			}
			else if (x < 0 && y > 0) {
				System.out.println("2º Quadrante");
			}
			else if (x < 0 && y < 0) {
				System.out.println("3º Quadrante");
			}
			else {
				System.out.println("4º Quadrante");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		sc.close();


	}

}
