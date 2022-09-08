package util;

/*
	A classe e responsavel por receber o valor atual do dolar
	e calcular a conversao para real com imposto IOF aplicado.
*/

public class CurrencyConverter {
	
	public static double dolValue;
	public static double realValue;
	public static final double IOF = 0.06;

	public static double calculateConversion() {
		return ((dolValue * IOF) + dolValue) * realValue;
	}
}
