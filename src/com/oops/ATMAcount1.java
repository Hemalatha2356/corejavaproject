package com.oops;

public class ATMAcount1 {
	
	private int accountnum;
	private String accountholdername;
	private double balance;
	private int pin;
	
	public void setAccountnum(int accountnum) {
		this.accountnum=accountnum;
	}
	public int getaccountnum() {
		return accountnum;
	}
	
	public void setaccountholdername(String accountholdername) {
		this.accountholdername=accountholdername;
	}
	public String getaccountholdername() {
		return accountholdername;
	}
	
	public void setbalance(double balance) {
		if(balance>=0) {
			this.balance=balance;
		}else {
			System.out.println("invalid");
		}
		
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setpin(int pin) {
		if(pin>=1000&&pin<=9999) {
			this.pin=pin;
		}else {
			System.out.println("invlid");
		}
	}
	
	public int getpin() {
		return pin;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("atm info");
		ATMAcount1 a1 =new ATMAcount1();
		
		a1.setAccountnum(12232424);
		a1.setaccountholdername("kavya");
		a1.setbalance(10000);
		a1.setpin(2345);
		System.out.println(a1.getaccountnum());
		System.out.println(a1.getaccountholdername());
		System.out.println(a1.getbalance());
		System.out.println(a1.getpin());
		

	}

}
