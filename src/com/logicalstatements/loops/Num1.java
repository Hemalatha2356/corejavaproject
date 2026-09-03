package com.logicalstatements.loops;

import java.util.Scanner;
public class Num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Numbers divisible by both 5 and 7 are:");
		for(int i=1;i<=n;i++) {
			if(i%5==0 && i%7==0) {
				System.out.print(i + " ");
			}
		}
	}

}
