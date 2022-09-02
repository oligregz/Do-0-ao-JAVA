package aplication;

import java.util.Locale;
import java.util.Scanner;

//	Calculo da aera de dois hexagonos regulares sem POO
public class NoPOOAreaOfHexagon {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double la, lb;
		System.out.println("Digite o valor do lado do hexagono A:");
		la = sc.nextDouble();
		System.out.println("Digite o valor do lado do hexagono B:");
		lb = sc.nextDouble();
		
		double areaA =  (3 * Math.pow(la, 2) * Math.cbrt(3)) / 2;
		double areaB =  (3 * Math.pow(lb, 2) * Math.cbrt(3)) / 2;
		
		System.out.printf("A área do hexagono A é %.2f m%njá a do hexagono B é %.2f m .", areaA, areaB);
		sc.close();
	}

}
