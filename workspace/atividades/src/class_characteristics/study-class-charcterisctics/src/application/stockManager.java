package application;

import java.util.Locale;
import java.util.Scanner;

public class stockManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Insira os dados do produto nos campos abaixo");
		System.out.println("Nome:");
		System.out.println("Preco:");
		System.out.println("Quantidade:");
		
		sc.close();
	}

}
