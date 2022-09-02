package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Hexagon;

public class AreaOfHexagonObject {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Hexagon ha, hb;
		ha = new Hexagon();
		hb = new Hexagon();
		
		System.out.println("Digite o valor do lado do hexagono A:");
		ha.l = sc.nextDouble();
		
		System.out.println("Digite o valor do lado do hexagono b:");
		hb.l = sc.nextDouble();
		
		double areaA = ha.area();
		double areaB = hb.area();
		
		System.out.printf("Area do hexagono A e %.3f m%ne a do hexagono B e %.3f m", areaA, areaB);
		sc.close();
	}

}
