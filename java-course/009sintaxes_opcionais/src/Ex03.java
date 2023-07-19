import java.util.Locale;

public class Ex03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Expressão condicional ternaria
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		

	}

}
