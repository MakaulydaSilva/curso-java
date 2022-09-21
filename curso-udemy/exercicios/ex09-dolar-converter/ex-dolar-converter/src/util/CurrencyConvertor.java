package util;

public class CurrencyConvertor {
     
	public static final double IOF = 6.00;
	
	public static double reais(double dolar, double totalDolar) {
		
		double reais = dolar * totalDolar;
		return reais * (IOF/100) + reais;
	}
}
