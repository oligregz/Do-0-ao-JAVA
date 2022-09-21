package entities;

public class BankAccount {

	private int accountNumber;
	private String accountHolder;
	private double deposit;
	
	public BankAccount(int accountNumber, String accountHolder, double deposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.deposit = deposit;
	}
	
	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
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
		return deposit;
	}
	
	public void setDeposit(double newDeposit) {
		this.deposit = newDeposit;
	}
}
