package com.logicalstatements.loops;

import java.util.Scanner; 
public class GCDnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number : ");
		int a= sc.nextInt();
		System.out.println("Enter a second number : ");
		int b= sc.nextInt();
		int gcd=1;

		for(int i=1;i<=a&&i<=b;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		int LCM = (a*b)/gcd;
		
		System.out.println("GCD (hcf) : " + gcd );
		
		System.out.println("LCM : " + gcd );
		
		

	}

}
