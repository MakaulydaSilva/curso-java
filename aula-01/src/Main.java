import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		System.out.println(x);
		System.out.printf("%.2f%n", x); // 2 casas decimais
	    System.out.println(y);
		System.out.println("Boa tarde!");
		System.out.printf("%.4f%n", x); // 4 casas decimais
		Locale.setDefault(Locale.US); // Serve para deixar os separadores decimais com '.'
		System.out.printf("%.4f%n", x); // Agora está com '.'
		System.out.println("Resultado = " + x + " Metros"); // Concatenação
		System.out.printf("Resultado = %.2f metros%n", x); //Concatenação com casas decimais
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		

	}

}
