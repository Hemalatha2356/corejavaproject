package com.fundamentals;

public class BankAccount {
	
	static int NextAccountNumber=1001;
	
	
	int AccountNumber;
	String CustomerName;
	long AccountBalance;
	
	{
		AccountNumber = NextAccountNumber++;
	}
	
	void show() {
		
		System.out.println("AccountNumber = " + AccountNumber);
		System.out.println("CustomerName = " + CustomerName);
		System.out.println("AccountBalance = " + AccountBalance);
		
	}

	public static void main(String[] args) {
		
		BankAccount t1 = new BankAccount();
		t1.CustomerName="Hema";
		t1.AccountBalance=5778;
		t1.show();
		
		BankAccount t2 = new BankAccount();
		t2.CustomerName="kavya";
		t2.AccountBalance=79800;
		t2.show();
		
		BankAccount t3 = new BankAccount();
		t3.CustomerName="Latha";
		t3.AccountBalance=70876;
		t3.show();
		
	}

}
