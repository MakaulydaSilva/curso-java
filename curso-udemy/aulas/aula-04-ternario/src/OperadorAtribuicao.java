import java.util.Locale;
import java.util.Scanner;

public class OperadorAtribuicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			//Operador de atribuição cumulativo
			conta += (minutos - 100) * 2.0; //Subtraio valor excedente menos 100 que é o basico para não cobrar os minutos extras
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
        
		sc.close();
	}

}
