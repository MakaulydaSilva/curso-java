import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 0, y = 0;

		int valor;

		x = sc.nextInt();
		y = sc.nextInt();
		valor = x + y;

		System.out.println("SOMA = " + valor);

		sc.close();

	}

}
