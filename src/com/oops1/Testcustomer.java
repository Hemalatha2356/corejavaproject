package com.oops1;

public class Testcustomer {

	public static void main(String[] args) {
		System.out.println("customer info");
		System.out.println();
		
		Customer c1 = new Customer();
		c1.setCoustomerid(101);
		c1.setName("hema");
		c1.setEmail("hema@gmail.com");
		c1.setPhonenumber(1234567890);
		System.out.println(c1.getCoustomerid());
		System.out.println(c1.getName());
		System.out.println(c1.getPhonenumber());
		System.out.println(c1.getEmail());

	}

}
