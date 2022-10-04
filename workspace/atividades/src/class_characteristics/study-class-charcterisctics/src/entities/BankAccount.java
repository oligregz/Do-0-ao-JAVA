package entities;

public class BankAccount {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String newAccountHolder) {
		this.accountHolder = newAccountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double newDeposit) {
		balance += newDeposit;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " 
					+ accountNumber
					+ ", Holder: "
					+ accountHolder
					+ ", Balance: "
					+ String.format("%.2f", balance);
				
	}
}
