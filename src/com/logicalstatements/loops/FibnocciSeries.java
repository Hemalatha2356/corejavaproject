package com.logicalstatements.loops;

import java.util.Scanner;
public class FibnocciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("how many numbers are your the print ?..");
		int n = sc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;
		
		System.out.println(n1 + " " + n2);
		for(int i=0;i<=n-2;i++) {
			System.out.println(" " + n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
