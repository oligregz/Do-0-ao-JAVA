package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProductsInStock(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProductsInStock(int quantity) {
		this.quantity -= quantity;
	}
}
