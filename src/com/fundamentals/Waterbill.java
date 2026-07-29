package com.fundamentals;
import java.util.Scanner;

public class Waterbill {
	Scanner sc = new Scanner(System.in);
	void claculatewaterbill() {
		System.out.println("Enter customer name : ");
		String customername = sc.next();
		System.out.println("Enter water units : ");
		int units = sc.nextInt();
		int rate=8;
		double totalbill = units*rate;
		System.out.println("customername : " + customername);
		System.out.println("units : " + units);
		System.out.println("totalbill : " + totalbill);
		
	}

	public static void main(String[] args) {
		
		Waterbill t1 = new Waterbill();
		t1.claculatewaterbill();

	}

}
