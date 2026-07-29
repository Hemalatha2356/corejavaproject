package com.fundamentals;

public class Bank {
	double balance = 10000.0;
	void checkbalance(){
		System.out.println("cureent balance : " + balance);
		
	}
	void deposite(double amount) {
		
		System.out.println("deposite ammount : " + amount);
		balance = balance + amount; //balance+=amount;
		System.out.println("cureent balance : " + balance);
	}

	public static void main(String[] args) {
		System.out.println("main method started : ");
		
		Bank t1 = new Bank();
		t1.checkbalance();
		t1.deposite(5000);
		t1.withdrawamount(10000);
	}
	void withdrawamount(double amount) {
		System.out.println("withdraw amount : " + amount);
		System.out.println("withdraw sucessfully ");
	}
}
