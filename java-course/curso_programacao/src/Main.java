import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "Makauly";
		int idade = 24;
		double renda = 1600.00;
		
		System.out.println("Olá mundo!");
		System.out.print("Bom dia! "); // Sem o ln no final não terá quebra de linha.
		System.out.println("Boa Tarde! Boa Noite!");
		Locale.setDefault(Locale.US); //Transforma as vírgulas dos números flutuantes em pontos.
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); //f no final é abreviação de formatted, o que está entre aspas significa que vai ser formatado em 2 números flutuantes e que vai pular linha(Os códigos são os padrões da linguagem).
		System.out.printf("%.4f%n", x); //Com 4 casas decimais.
		System.out.println("Resultado = " + x + " metros."); //Concatenando.
	    System.out.printf("Resultado = %.2f metros.%n", x); //O valor de x entra no lugar do [%.2f].
	    System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda); // [%s = texto], [%d = inteiro], [%n = quebra de linha].
	}

}
