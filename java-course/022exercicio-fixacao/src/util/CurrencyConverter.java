package util;

public class CurrencyConverter {

	public static double dollarPrice;

	public static double dollarBought;

	public static double paidInReais() {
		double converter = (dollarPrice * dollarBought);
		double iofConverter = converter * 6 / 100;
		return converter + iofConverter;
	}
}
