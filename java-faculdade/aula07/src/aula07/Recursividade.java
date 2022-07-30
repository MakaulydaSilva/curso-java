package aula07;

public class Recursividade {

	public static void main(String[] args) {
		imprimirSequencia(1000);

	}
	
	public static void imprimirSequencia(Integer x) {
		
		if (x == 0) return;
		System.out.println(x);
		imprimirSequencia(x - 1);
	}

}
