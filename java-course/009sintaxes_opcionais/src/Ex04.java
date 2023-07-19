import java.util.Locale;

public class Ex04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double price = 9.9; // Enquanto a variável não for inicializada ela não pode ser utilizada

		double discount = 0; // Para funcionar declare a variável fora do escopo

		if (price < 10) {
			discount = price * 0.1; // A variável está dentro do escopo e não poderá ser usada dentro desta
									// estrutura
		} else {
			discount = 0; // Caso a condição seja falsa , temos a garantia que a varivavel irá funcionar
		}

		System.out.println(discount);

	}

}
