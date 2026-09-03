package com.oops1;

public class Testproduct {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductId(101);
		p1.setPrice(10000);
		p1.setProductName("pen");
		p1.setQuantity(10);
		
		p1.addstock(10);
		p1.removestock(5);
		System.out.println("priduct id " + p1.getProductId());
		System.out.println("product price " + p1.getPrice());
		System.out.println("product name " + p1.getProductName());
		System.out.println("quantity " + p1.getQuantity());
		
	}

}
