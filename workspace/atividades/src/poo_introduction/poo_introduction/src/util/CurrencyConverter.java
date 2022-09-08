package util;

/*
	A classe e responsavel por receber o valor atual do dolar
	e calcular a conversao para real com imposto IOF aplicado.
*/

public class CurrencyConverter {
	
	public static final double IOF = 0.06;

	public static double calculateConversion(double dol, double amount) {
		return ((dol * IOF) + dol) * amount;
	}
}
