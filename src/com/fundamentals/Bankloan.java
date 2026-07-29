package com.fundamentals;

public class Bankloan {
	void loanDetails() {
		System.out.println("Enter the loan details : ");
	}
	void applyloan(String customerName,double amount) {
		System.out.println("customer name : " +customerName);
		System.out.println("Enter amount : " + amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankloan t1 = new Bankloan();
		t1.loanDetails();
		t1.applyloan("Hema" ,5000);

	}

}
