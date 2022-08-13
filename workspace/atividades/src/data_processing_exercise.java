import java.util.Locale;
import java.util.Scanner;

//	Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//	mostre:
//	a) a área do triângulo retângulo que tem A por base e C por altura.
//	b) a área do círculo de raio C. (pi = 3.14159)
//	c) a área do trapézio que tem A e B por bases e C por altura.
//	d) a área do quadrado que tem lado B.
//	e) a área do retângulo que tem lados A e B.
public class data_processing_exercise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		sc.close();
// a)
		double tra = A * C / 2;
		System.out.printf(" A área do trinagulo retângulo é: %.2f%n metros quadrados.", tra);

		
	}

}
