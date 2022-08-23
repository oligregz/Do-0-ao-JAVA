import java.util.Scanner;
// Leia números, some e mostre o valor da soma
// quando 0 for adicionado
public class repition_structure_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0 ) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("A soma dos números inseridos é:" + soma);
		sc.close();

	}

}
