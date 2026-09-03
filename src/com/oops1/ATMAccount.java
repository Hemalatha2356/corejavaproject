package com.oops1;

public class ATMAccount {
	private double balance;
	
	
	public double getBalance() {
        return balance;
    }

	
	public void deposite(int amount) {
		if(amount>0) {
			balance=balance+amount;
		}else {
			System.out.println("invalid");
		}
	}
	public void withdraw(int amount) {
		if(amount>0&&amount<= getBalance()) {
			balance=balance-amount;
		}else {
			System.out.println("invalid");
		}
	}
	public double checkbalance() {
       return getBalance();
		
	}
	

}
