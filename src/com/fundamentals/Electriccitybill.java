package com.fundamentals;
import java.util.Scanner;
public class Electriccitybill {
	Scanner sc = new Scanner(System.in);
	
	void calculatebill() {
		System.out.println("Enter customername : ");
		String customername = sc.next();
		
		System.out.println("number of electric units consumed : ");
		int units = sc.nextInt();
		
		int rate=5;
		double totalbill = units*rate;
		System.out.println("----------electriccity bill-------------- ");
		System.out.println("customername : " + customername);
		System.out.println("units : " + units);
		System.out.println("totalbill : " + totalbill);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Electriccitybill t1 = new Electriccitybill();
		
		t1.calculatebill();
		
		

	}

}
