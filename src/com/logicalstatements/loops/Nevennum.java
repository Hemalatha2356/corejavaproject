package com.logicalstatements.loops;

import java.util.Scanner;
public class Nevennum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n= sc.nextInt();
		
		System.out.println("print the first n even numbers : " + n);
		
		for(int i=1;i<=n;i++) {
			System.out.print(2*i-1 + " ");
		}
		sc.close();

	}

}
