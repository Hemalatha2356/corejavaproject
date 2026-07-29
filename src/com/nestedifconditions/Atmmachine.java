package com.nestedifconditions;

import java.util.Scanner;
public class Atmmachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Enter pin : ");
		int Enterpin = sc.nextInt();
		System.out.println("Enter correct pin : ");
		int correctpin = sc.nextInt();
		System.out.println("Enter a balance : ");
		double balance = sc.nextDouble();
		System.out.println("with draw amount : ");
		double withdrwalamount = sc.nextDouble();
		System.out.println("daily limit : ");
		int dailylimit = sc.nextInt();
		
		if(Enterpin==correctpin) {
			System.out.println("the pin correct pin");
			if(balance >= withdrwalamount) {
				System.out.println("Enter the amount");
				if(withdrwalamount<=dailylimit) {
					balance=balance-withdrwalamount;
					
					System.out.println("withdrawsucessfully!!");
					System.out.println("remaining balance : " + balance);
					if(withdrwalamount<=dailylimit) {
						System.out.println("daily limit is 20000 : ");
					}else {
						System.out.println("the daily limit is completed!!");
					}
				}else {
					System.out.println("Withdrawal failed: Amount exceeds daily limit.");
				}
			}else {
				System.out.println("failed : because the atm pin is wrong ");
			}
		}else {
			System.out.println("the pin invalid!! ");
		}
		

	}

}
