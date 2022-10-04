package application;

import java.util.Locale;

import java.util.Scanner;

import entities.BankAccount;

public class BankDataGenerator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount account;
		
		System.out.println("Insira o numero da conta:");
		int number = sc.nextInt();
		System.out.println("Insira nome do propietario(a):");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Deseja realizar um deposito inicial (s/n)?");
		char response = sc.next().charAt(0);
		
		
//		Bloco condicional de atribuição de valores
		
		if (response == 's') {
			System.out.println("Digite a quantia a ser inserida:");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(number, holder, initialDeposit);
		}
		else {
			account = new BankAccount(number, holder);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Digite um valor de deposito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		
		
		System.out.println();
		System.out.print("Digite um valor de saque: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
			
		
		
		sc.close();
	}

}
