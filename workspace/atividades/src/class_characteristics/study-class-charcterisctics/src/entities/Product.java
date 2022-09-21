package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product(String assignedName, double assignedPrice, int assignedQuantity) {
		this.name = assignedName;
		this.price = assignedPrice;
		this.quantity = assignedQuantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProductsInStock(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProductsInStock(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " unidades, Total: $ "
			+ String.format("%.2f", totalValueInStock());
				
	}
}
