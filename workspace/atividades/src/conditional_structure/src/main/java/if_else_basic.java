// Atividade para gerar quanto de imposto
// pagar em relação a quantidade do salário
import java.util.Scanner;

public class if_else_basic {

	public static void main(String[] args) {
		System.out.println("Insira seu salário abaixo:");
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		sc.close();
		System.out.println("Você pagará " + salary + " % de imposto");
	}

}
