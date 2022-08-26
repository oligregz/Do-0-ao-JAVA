import java.util.Locale;
import java.util.Scanner;

// exercicio de conversao de temperatura com do-while
public class do_while_exercise {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		char resposta;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite a temperatura em Celcius:");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("A temperatura equivalente em Fahrenheit e %.2f .%n", F);
			System.out.println("Se deseja continuar, tecle 's', caso contrario, tecle 'n'.");
			
			resposta = sc.next().charAt(0);
			
		} while(resposta != 'n');

		sc.close();
	}

}
