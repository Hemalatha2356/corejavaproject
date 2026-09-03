package com.logicalstatements.loops;

import java.util.Scanner;

public class Happynum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");//19
		int n= sc.nextInt();
		
		boolean status = ishappy(n);
		
		if(status) {
			System.out.println("happy number");
		}else {
			System.out.println("unhappy number");
		}
	}
	
	static boolean ishappy(int n) {
		boolean status = false;
		
		int digit=0;
		int sum=0;
		int original=n;
		
		while(n!=1&&n!=4) {
			return true;
		}
		
		while(n>0) {
			digit=n%10;
			n=n/10;
			sum=sum+digit*digit;
		}
		if(original==sum) {
			return true;
		}
		return status;
	}
}
