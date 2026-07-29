package com.constructor;

public class ElectriccityBill {
	String customername;
	int units;
	int billAmount;
	
	ElectriccityBill(){
		System.out.println("********no args constructor******");
		customername = "hema";
		units=100;
		billAmount=units*5;
		
		
	}
	ElectriccityBill(String customername,int units){
		this.customername=customername;
		this.units=units;
		this.billAmount=units*5;
	}
	
	void display(){
		System.out.println("Enter customername : " + customername);
		System.out.println("enter units : " + units);
		System.out.println("enter billAmount : " + billAmount);
		
		
	}
	

	public static void main(String[] args) {
		ElectriccityBill e = new ElectriccityBill();
		e.display();
		ElectriccityBill e1 = new ElectriccityBill("hema",670);
		e1.display();

	}

}
