package com.oops1;

public class Product {
	private int productId;
	private String productName;
	private double price; 
	private int quantity;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>=0) {
			this.price = price;
		}else {
			System.out.println("invalid");
		}
		
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity>=0) {
			this.quantity = quantity;
		}else {
			System.out.println("invalid");
		}
		
	}
	
	void addstock(int amount ) {
		if(amount>=0) {
			quantity=quantity+amount;
		}else{
			System.out.println("invalid");
		}
		
	}
	
	void removestock(int amount) {
		if(amount>=0&&amount<=quantity) {
			quantity=quantity-amount;
		}else {
			System.out.println("invalid");
		}
	}
	

}
