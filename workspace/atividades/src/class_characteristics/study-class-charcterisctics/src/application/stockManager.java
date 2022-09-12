package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class stockManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Insira os dados do produto nos campos abaixo");
		System.out.println("Nome:");
		String name = sc.nextLine();
		System.out.println("Preco:");
		double price = sc.nextDouble();
		System.out.println("Quantidade:");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Informacoes do produto:" + product);
		
		System.out.println();
//		System.out.println("Deseja adicionar algo ao estoque, tecle 1, se quiser remover tecle 2, se terminou, tecle 3.");
		
		System.out.println("Adicione unidades ao estoque: ");
		quantity = sc.nextInt();
		product.addProductsInStock(quantity);
		System.out.println();
		System.out.println("Informacoes do produto:" + product);

		System.out.println("Remova unidades do estoque: ");
		quantity = sc.nextInt();
		product.removeProductsInStock(quantity);
		System.out.println();
		System.out.println("Informacoes do produto:" + product);


		
		sc.close();
	}

}
