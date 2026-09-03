package com.logicalstatements.loops;
import java.util.Scanner;
public class PrimeorNot {
	static boolean isprime(int n) {
		 boolean status=true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		isprime(n);
		if(isprime(n)) {
			System.out.println("prime number : ");
			
		}else {
			System.out.println("not prime !!");
		}

	}

}
