import java.util.Scanner;

public class TesteBitABit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mascara = 0b00100000; //0b indica que virá um número binario
		int n = sc.nextInt();
		
		if ((n & mascara) != 0) {
			System.out.println("Sexto bit é verdadeiro!");
		}
		else {
			System.out.println("Sexto bit é falso!");
		}
			
		sc.close();

	}

}
