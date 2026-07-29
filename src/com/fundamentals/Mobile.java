package com.fundamentals;

public class Mobile {
	void showplandetails() {
		System.out.println("current recharge plans");
		System.out.println("plan Name : unlimited 299");
		System.out.println("validity 28 days");
		System.out.println("call : unlimited");
	}
	void recharge(double amount){
		System.out.println("amount paid " + amount);
		System.out.println("recharge successfully");
		
	}

	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		obj1.showplandetails();
		obj1.recharge(299);
	

	}

}
