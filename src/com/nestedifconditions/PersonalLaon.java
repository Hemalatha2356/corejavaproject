package com.nestedifconditions;

import java.util.Scanner;
public class PersonalLaon {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Annual salary : ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter credit Score : ");
		int Score = sc.nextInt();
		
		System.out.println("Existing Loan(true/false)");
		boolean Loan = sc.nextBoolean();
		
		System.out.println("Employee Status : ");
		boolean status = sc.nextBoolean();
		
		System.out.println("Experience year : ");
		int year = sc.nextInt();
		
		if(salary>=600000) {
			System.out.println("eligible for loan ");
			if(Score>=750) {
				System.out.println("the credite score is matched ");
				if(Loan) {
					System.out.println("the not exting loan");
					if(status) {
						System.out.println("perment employee");
						if(year>=2) {
							System.out.println("loan approved");
						}else {
							System.out.println("the loan is not approved");
						}
					}else {
						System.out.println("not perment employee");
					}
				}else {
					System.out.println("not approval");
				}
			}else {
				System.out.println("not approval the credite score is not matched");
			}
		}else {
			System.out.println("the salary is not matched : ");
		}
		

	}

}
