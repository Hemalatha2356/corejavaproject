package com.logicalstatements.loops;
import java.util.Scanner;
public class Isprime {
	
	static boolean isprime(int n) {
		boolean Status = true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n % i == 0) {
				return false;
			}
			
		}
		return Status;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		isprime(n);
		boolean notskip=true;
		for(int i=1;i<n;i++) {
			if(isprime(i)) {
				if(notskip) 
					System.out.println(i+" ");
				notskip=!notskip;
			}
		}

	}

}
