import java.util.Scanner;

// testando sexto bit com uma mascara
public class main_other_basic_topcs_java {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		// 89 e 113 sao numeros para teste
		
		int n = sc.nextInt();
		int mask = 0b100000; // poderia ser 32 no lugar do numero
		
		if ((n & mask) != 0) {
			System.out.println("O sexto bit e verdadeiro.");
		} else {
			System.out.println("O sexto bit e falso.");
		}
		sc.close();
	}
}
