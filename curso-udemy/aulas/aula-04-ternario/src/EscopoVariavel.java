
public class EscopoVariavel {

	public static void main(String[] args) {
		//A variavel precisa ser iniciada para ser usada
		double price = 400.00;
		
		//Agora sim a variavel foi declarada fora do escopo e também foi iniciada
		double discount = 0;
		
		if (price < 200.00) {
			//Variavel foi declarada dentro da estrutura condicional, sendo assim ela só funcionara dentro deste escopo 
		    discount = price * 0.1;
		}
		
		System.out.println(discount);

	}

}
