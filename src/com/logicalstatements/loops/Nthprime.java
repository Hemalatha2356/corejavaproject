package com.logicalstatements.loops;

import java.util.Scanner;
public class Nthprime {

	static boolean isprime(int n) {
		boolean status = true;
//		int count=0;
		if(n==0||n==1) {
			return false;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int count=0;
		
		isprime(n);
		
		for(int i=1;;i++) {
			if(isprime(i)) {
				count++;
				if(count==n) {
					System.out.println("nth prime number = " + i);
					break;
				}
			}
		}

	}

}
