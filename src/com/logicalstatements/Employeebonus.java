package com.logicalstatements;

import java.util.Scanner;
public class Employeebonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a experiance(in year) : ");
		int year = sc.nextInt();
		int bouns=0;
		if(year<2) {
			
			System.out.println("no bouns : " + bouns);
		}
		else if(year<=5) {
		
			System.out.println("10% of bouns");
		}
		else{
			
			System.out.println("20% of bouns");
		}
		sc.close();
		

	}

}
