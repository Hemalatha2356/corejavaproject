package com.logicalstatements.loops;

import java.util.Scanner;
public class Factors {
	
	static void findfactors(int n) {
		int i=0;
		for(i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		findfactors(n);

	}

}
