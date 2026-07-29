package com.logicalstatements;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started : ");
		System.out.println("Enter a marks : ");
		int marks = sc.nextInt();
	
		
		if(marks>=35) {
			
			System.out.println("passed : ");
		}
		else {
			System.out.println("failed :");
		}
		
	

	}

}
