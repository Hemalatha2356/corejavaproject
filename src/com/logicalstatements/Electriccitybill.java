package com.logicalstatements;

import java.util.Scanner;
public class Electriccitybill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started : ");
		System.out.println("enter a units ");
		int units = sc.nextInt();
		int bill;
		if(units>=0 && units<=100) {
			bill = units*2;
			System.out.println("Rate :2 per unit ");
			System.out.println("Electriccity bill : " + bill);
		}
		else if(units<=200) {
			bill = units*3;
			System.out.println("Rate :3 per unit ");
			System.out.println("Electriccity bill : " + bill);
		}
		else if(units>200) {
			bill = units*5;
			System.out.println("Rate :5 per unit ");
			System.out.println("Electriccity bill : " + bill);
		}
		else {
			System.out.println("invalid units ");
		}
		sc.close();
		

	}

}
