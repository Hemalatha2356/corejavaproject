package com.logicalstatements;

import java.util.Scanner;
public class CheckBMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter BMI : ");
		double bmi = sc.nextDouble();
		if(bmi<18.5) {
			System.out.println("under weight ");
		}else if(bmi<=24.9) {
			System.out.println("normal");
		}
		else if(bmi<=29.9) {
			System.out.println("overWeight");
		}
		
		else {
			System.out.println("obses ");
		}
		sc.close();
		
	}

}
