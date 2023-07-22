import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int mask = 0b00100000; // 32 bínario
		int n = sc.nextInt();

		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");

		} else {
			System.out.println("6th bit is false");
		}
		
		int num1 = 0b00010100; // 20
		int num2 = 0b00111100; // 60
	
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);	
		
		sc.close();
	}

}
