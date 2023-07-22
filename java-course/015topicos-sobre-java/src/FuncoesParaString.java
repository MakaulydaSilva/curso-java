/*
Formatar: toLowerCase(), toUpperCase(), trim()
Recortar: substring(inicio), substring(inicio, fim)
Substituir: Replace(char, char), Replace(string, string)
Buscar: IndexOf, LastIndexOf
str.Split(" ")
*/

public class FuncoesParaString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2); 
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'X');
		String s07 = original.replace("abc", "XY");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: " + original + "-");
		System.out.println("toLowerCase: " + s01 + "-");
		System.out.println("toUpperCase: " + s02 + "-");
		System.out.println("trim: " + s03 + "-"); // Elimina o espaço final na string
		System.out.println("substring(2): " + s04 + "-"); //Começa a string a partir do indice 2
		System.out.println("substring(2, 9): " + s05 + "-"); //Começa a string a partir do indice 2 até o indice 9
		System.out.println("replace('a', 'X'): " + s06 + "-"); //Troco os caractéres
		System.out.println("replace('abc', 'XY'): " + s07 + "-"); //Troco a string
		System.out.println("indexOf(bc): " + i);
		System.out.println("lastIndexOf(bc): " + j);
		
		String frase = "potato apple lemon orange";
		
		String[] vect = frase.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		

	}

}
