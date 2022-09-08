package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ConversionCalculator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do atual do dolar:");
		double dolToday = sc.nextDouble();
		System.out.println("Informe a quantidade de compra:");
		double dolarAmout = sc.nextDouble();
		
		double resultOfConversation = CurrencyConverter.calculateConversion(dolToday, dolarAmout);
		System.out.printf("O cambio custara %.2f reais.", resultOfConversation);
		
		sc.close();
	}

}
