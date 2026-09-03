package com.logicalstatements.loops;

import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter even number : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("odd number : ");
		int n1 = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
		

	}

}
