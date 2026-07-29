package com.constructor;

public class Bank {
	long accountno;
	String holdername;
	double balance;
	
	Bank(){
		System.out.println("*****no args constructor*****");
		accountno=678567890;
		holdername="hema";
		balance=56789;
		
	}
	Bank(long accountno,String holdername,double balance){
		System.out.println("*******parameterized name*******");
		this.accountno=accountno;
		this.holdername=holdername;
		this.balance=balance;
		
		
	}
	void display() {
		System.out.println("enter a accountnumber : " + accountno);
		System.out.println("enter a holdername : " + holdername);
		System.out.println("enter a balance : " + balance);
	}

	public static void main(String[] args) {
		
	   Bank s = new Bank();
	   s.display();
	   Bank s1 = new Bank(4567899,"hemalatha",5678);
	   s1.display();
			   

	}

}
