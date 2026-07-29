package com.fundamentals.constructors;

public class BankAccount {
	
	int accountnumber;
	String holderName;
	double balance;
	
	
	public BankAccount(){
		
	}
	
	BankAccount(int accountnumber,String holderName,double balance){
		
		this.accountnumber=accountnumber;
		this.holderName=holderName;
		this.balance=balance;
		
	}
	
	
	
	//copy constructor
	
	BankAccount(BankAccount b){
		this.accountnumber=b.accountnumber;
		this.holderName=b.holderName;
		this.balance=b.balance;
		
	}
	
	void deposite(double amount) {
		balance += amount;
	}
	
	
	void Bankinfo() {
		System.out.println("**********BankAccount*******************");
		System.out.println("Bank Accountnumber : " + accountnumber);
		System.out.println("Bank holdername : " + holderName);
		System.out.println("Bank balance : " + balance);
		

	}

	public static void main(String[] args) {
		
		
	
		
		BankAccount b = new BankAccount(987654678,"Hema",900000);
		b.Bankinfo();
		
		BankAccount account = new BankAccount(b);
		b.Bankinfo();
		
		BankAccount account1 = new BankAccount(account);
		
		account1.deposite(5000);
	
		account1.Bankinfo();
		

	}

}
