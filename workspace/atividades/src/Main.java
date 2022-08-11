import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.print("Hello world!");
		System.out.println(" Haha");
		
		int y = 32;
		double x = 10.645264;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Foi");
// Locale implementado para troca de padrão na impressão dos dados
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", x);

		}

}
