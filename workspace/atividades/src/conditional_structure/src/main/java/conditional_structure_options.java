import java.util.Scanner;

// Exercício para fixar a utilização
// de opções para estruturas condicionais

public class conditional_structure_options {

	public static void main(String[] args) {
		System.out.println("Insira seu salário(double type)");
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
// if - else
		if (0 < salary && salary < 1000 ) System.out.println("Insento de imposto.");
		else if (1000 < salary && salary < 2000) System.out.println("Pague 6% de imposto.%n");
		else System.out.println("Pague 10% de imposto.");
		
		System.out.println("Agora escolha um salário, 0, 1000, 2000 ou 3000(int type)");
		int intSalary = sc.nextInt();
		sc.close();
		
// switch - case
		switch(intSalary) {
			case 0:
				System.out.println("Insento de imposto.");
				break;
			case 1000:
				System.out.println("Insento de imposto.");
				break;
			case 2000:
				System.out.println("Pague 6% de imposto.");
				break;
			case 3000:
				System.out.println("Pague 10% de imposto.");
				break;
		}
	}

}
