package com.logicalstatements.loops;

import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n= sc.nextInt();
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println("the sum of the numbers is 0 to 10 : " + sum);
		

	}

}
