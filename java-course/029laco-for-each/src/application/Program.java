package application;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		// A mesma coisa usando o laço for each
		System.out.println("-------------------------------");

		for (String nomes : vect) {
			System.out.println(nomes);
		}

	}

}
