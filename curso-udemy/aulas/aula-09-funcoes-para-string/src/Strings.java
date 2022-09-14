
public class Strings {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-"); //Retira os espaços dos cantos da string
		System.out.println("substring(2): -" + s04 + "-"); //Gera uma nova string removendo os indices selecionado
		System.out.println("substring(2, 9): -" + s05 + "-");  // Gera uma nova string do primeiro indice selecionado adiante até o outro indice (sem coloca-lo na função)
		System.out.println("replace('a', 'x'): -" + s06 + "-"); // Troca o primeiro argumento pelo segundo na string
		System.out.println("replace('abc', 'xy'): -" + s07 + "-"); // Mesma coisa que em cima, mas troca string
	    System.out.println("IndexOf('bc') :" + i ); //Verifica a primeira ocorrência da string 
	    System.out.println("LastIndexOf('bc') :" + j ); //Verifica a ultima ocorrência da string
	} 
	
	

}
