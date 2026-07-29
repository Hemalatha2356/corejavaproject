package com.fundamentals;

public class Customer {

	public static void main(String[] args) {
		System.out.println("main method started");
		Customer c1 = new Customer();
		
		Customer c2 = new Customer();
		
		Customer c3 = new Customer();
		System.out.println(c1);
		c1=null;
		
		System.out.println(c2);

		System.out.println(c3);

	}

}
