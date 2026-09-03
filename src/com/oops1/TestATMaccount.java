package com.oops1;

public class TestATMaccount {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("atm infoo");
		
		ATMAccount a1 = new ATMAccount();
		System.out.println(a1.getBalance());
		a1.deposite(50000);
		
		System.out.println("balance deposite "+ a1.checkbalance());
		a1.withdraw(20000);
		System.out.println("Balance after withdrawal: " + a1.checkbalance());
		
		a1.checkbalance();
		

	}

}
