package com.fundamentals;

public class ATM {
	double balance = 50000;
	void showbalance() {
		System.out.println("current balance " + balance);
		
	}
	void withdraw(double amount) {
		System.out.println("withdraw amount " + amount);
	}

	public static void main(String[] args) {
		ATM t1 = new ATM();
		t1.showbalance();
		t1.withdraw(4000);


	}

}
