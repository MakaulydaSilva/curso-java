
public class Main {

	public static void main(String[] args) {
		   
		int x, y;
		
		double z;
		
		x = 5;
		
		y = 2 * x;
		
		z = 3 * y;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//----------------------------------------------------------------------
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		//-------------------------------------------------------------------
		
		int valor1 , valor2;
		
		double resultado;
		
		valor1 = 5;
		valor2 = 2;
		
		resultado = (double) valor1 / valor2; //Casting = conversão explícita dos valores 
		
		System.out.println(resultado);
		
		//--------------------------------------------------------------------
		
		double c;
		
		int d;
		
		c = 5.6;
		d = (int) c; //Casting = não me importa as casas decimais quero retornar um número inteiro
		
		System.out.println(d);
		

	}

}
