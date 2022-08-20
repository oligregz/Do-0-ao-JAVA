// Atividade para gerar quanto de imposto
// pagar em relação a quantidade do salário
import java.util.Scanner;

public class if_else_basic {

	public static void main(String[] args) {
		System.out.println("Insira seu salário abaixo:");
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		sc.close();
		
		if (0 < salary && salary <= 2000) {
			System.out.println("Insento de imposto.");	
		}
		else if (2000 < salary && salary < 3000) {
			System.out.println("Você vai pagar 8% de imposto.");	
		}
		else if (3000 < salary && salary < 4500) {
			System.out.println("Você vai pagar 18% de imposto.");	
		}
		else {
			System.out.println("Você vai pagar 28% de imposto.");
		}
	}

}
