import java.util.Scanner;

public class ScChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0); //Pega o primeiro caracter do seu string
		System.out.println("Você digitou: " + x);
		
		sc.close();

	}

}
