package com.logicalstatements;

import java.util.Scanner;
public class Calculateincome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started : ");
		System.out.println("Entera income : ");
		int income = sc.nextInt();
		int tax=0;
		if(income<250000) {
			System.out.println("no tax : " + tax);
		}
		else if(income<=500000){
			tax=income*5/100;
			System.out.println("5% of tax : " + tax);
		}
		else if(income<=1000000){
			tax=income*20/100;
			System.out.println("20% of tax : " + tax);
		}
		
		else {
			tax=income*30/100;
			System.out.println("tax  " + tax);
		}
	

	}

}
