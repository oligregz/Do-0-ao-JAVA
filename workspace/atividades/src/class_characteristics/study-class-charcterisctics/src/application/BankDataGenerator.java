package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class BankDataGenerator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o numero da conta:");
		int accountNumber = sc.nextInt();
		System.out.println("Insira nome do propietario(a):");
		String accountHolder = sc.next();


		//opcao de iniciar com deposito ou nao
		
		System.out.println("Deseja realzar um depósito? (1 -> sim / 2 -> nao)");
		int option = sc.nextInt();
		
		BankAccount data = new BankAccount(accountNumber, accountHolder);
		
		
		if (option == 1) {
			System.out.println("Insira um valor de deposito:");
			double deposit = sc.nextDouble();
			BankAccount dataWithDeposit = new BankAccount(accountNumber, accountHolder, deposit);
			System.out.println(dataWithDeposit.getData());
		}
		else if (option == 2){
			System.out.println(data.getData());
		}
		else {
			System.out.println("Pos, voce digitou algo de errado :(");
		}
		
			
		
		
		sc.close();
	}

}
