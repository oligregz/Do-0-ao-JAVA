import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.print("Hello world!");
		System.out.println(" Haha");
		
		int y = 32;
		double x = 10.645264;
		String nome = "Maria";
		int idade = 31;
		double renda = 4350.0;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Foi");
// Locale implementado para troca de padrão na impressão dos dados
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", x);

// Concatenando
		
		System.out.println("x equivale á " + x + " metros");
		
// Concatenando com vários elementos
// %f=ponto flutuante %n=quebra linha
		
		System.out.printf("x equivale á %.2f metros%n", x);
		
// Concatenando com variáveis de tipos diferentes
// %d=inteiro %s=texto
		
		System.out.printf("%s tem %d anos e ganha %.2f R$",nome, idade, renda);
		
		}

}
