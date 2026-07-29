package com.fundamentals;

public class ShoppingCart {
	void additem(String itemName, int quality) {
		System.out.println("itemname details : " + itemName);
		System.out.println("quality :" + quality);
	}

	public static void main(String[] args) {
		ShoppingCart t1 = new ShoppingCart();
		t1.additem("laptop" , 2);
		
		

	}

}
