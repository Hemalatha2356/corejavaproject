package com.logicalstatements.loops;

import java.util.Scanner;
public class Evennum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int i=0;
		
		while(n<=30) {
			System.out.print(i+ " ");
			i=i+2;
		}
		
		
		
	}

}
