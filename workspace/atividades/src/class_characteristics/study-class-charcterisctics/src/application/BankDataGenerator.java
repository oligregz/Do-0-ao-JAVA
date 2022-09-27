package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class BankDataGenerator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o numero da conta e o nome do propietario(a):");
		int accountNumber = sc.nextInt();
		System.out.println("Insira o nome da conta e o nome do propietario(a):");
		String accountHolder = sc.next();
		System.out.println("Insira um valor de deposito:");
		double deposit = sc.nextDouble();
		
		BankAccount data = new BankAccount(accountNumber, accountHolder, deposit);
		
		System.out.println(data.getData());
		
		sc.close();
	}

}
