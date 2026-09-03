package com.oops;

public class Productinventory {
	
	@Override
	public String toString() {
		return "Productinventory [productid=" + productid + ", productname=" + productname + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	private int productid;
	private String productname;
	private int price;
	private int quantity;
	
	Productinventory(int productid,String productname,int price,int quantity){
		this.productid=productid;
		this.productname=productname;
		this.price=price;
		this.quantity=quantity;
	}
	
	
	public int getProductid() {
		return productid;
	}
//	public void setProductid(int productid) {
//		this.productid = productid;
//	}
	public String getProductname() {
		return productname;
	}
//	public void setProductname(String productname) {
//		this.productname = productname;
//	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		if(price>=0) {
//			this.price=price;
//		}else {
//			System.out.println("invalid");
//		}
//	}
	public int getQuantity() {
		return quantity;
	}
//	public void setQuantity(int quantity) {
//		if(quantity>=0) {
//			this.quantity = quantity;
//		}else {
//			System.out.println("invalid");
//		}
//	}
	//add stock
	public void addstock(int amount) {
		if(amount>0) {
			quantity=quantity+amount;
		}else {
			System.out.println("invalid stock");
		}
	}
	
	public void removestock(int amount) {
		if(amount>=0&&quantity<=amount) {
			quantity=quantity-amount;
		}else {
			System.out.println("invalid stock");
		}
	}
	
	
	
	

}
