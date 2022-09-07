import java.util.Scanner;

public class Ecercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		
		System.out.println("Coloque dois numeros e vajem se eles são multiplos:");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não são Multiplos");
		}
        
		sc.close();
	}

}
