package com.logicalstatements.loops;

import java.util.Scanner;
public class Decimaltobinary {
	
	static void convertDecimalToBinary(int n) {
		int r=0;
		
		while(n>0) {
			r=n%2;//10%2=0,5%2=1,2%2=0,1%2=1
			n=n/2;//
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers : ");
		int n = sc.nextInt();
		
		convertDecimalToBinary(n);

	}

}
