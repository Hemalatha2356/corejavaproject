package com.nestedifconditions;

import java.util.Scanner;
public class Mobilerecharge {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the select plandetails");
		String selectdetails = sc.next();
		System.out.println("Enter the avaliableplan");
		String avaliableplan = sc.next();
		System.out.println("Enter the walletbalance");
		int walletbalance = sc.nextInt();
		System.out.println("Enter the avaliableplan");
		int planprice = sc.nextInt();
		if(selectdetails.equals(avaliableplan)) {
			System.out.println("Enter the plan details: ");
			if(walletbalance>=planprice) {
				walletbalance=walletbalance-planprice;
				System.out.println("recharge sucessfully!!");
				System.out.println("remaining wallet balance!!");
				
			}
			else {
				System.out.println("recharge is not sucessfully!!");
			}
		}else {
			System.out.println("invalid recharge plan!!");
		}
		sc.close();
	}

}
