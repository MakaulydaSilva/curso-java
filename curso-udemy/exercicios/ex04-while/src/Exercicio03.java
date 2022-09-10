import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int var = sc.nextInt();
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
		while (var != 4) {

			if (var > 3) {
				System.out.println("Por favor digite um número de 1 á 3.");
			}
			
			if (var == 1 ) {
        		alcool += 1;
        	}
        	else if (var == 2) {
        		gasolina += 1;
        	}
        	else if (var == 3) {
        		diesel += 1;
        	}
        	
        	var = sc.nextInt();
        }
        
        System.out.println("Esta é a quantidade de vezes que abasteceram cada tipo de combustivel");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
	}

}
