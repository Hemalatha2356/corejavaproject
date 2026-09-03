package com.oops;

public class ATMAcount {
	
	private double balance;
	
	
	public void deposite(double amount) {
		if(amount>0) {
			balance = balance+amount;
		}else {
			System.out.println("invalid");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0&&amount <= balance) {
			balance=balance-amount;
		}else {
			System.out.println("invalid");
		}
	}
	
	public double checkblance() {
		return balance;
	}

	public static void main(String[] args) {
		
		ATMAcount a1 =new ATMAcount();
		
		a1.deposite(2222);
		a1.withdraw(500);
		System.out.println("currentbalance : " + a1.balance);
		

	}

}
