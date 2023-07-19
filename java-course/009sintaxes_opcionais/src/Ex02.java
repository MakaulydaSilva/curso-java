import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;
		// Switch-Case
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default: // Caso for colocado qualquer valor que não seja o desejado
			dia = "valor invalido";
			break;
		}

		System.out.println("Dia da semana: " + dia);

		sc.close();

	}

}
