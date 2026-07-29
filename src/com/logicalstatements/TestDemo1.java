package com.logicalstatements;
//write a program age<18 is eligible for vote

import java.util.Scanner;
public class TestDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started : ");
		
		System.out.println("Enter a age : ");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("eligible for vote");
			
		}else {
			System.out.println("not eligible for vote");
		}
		System.out.println("main method ended : ");
	

	}

}
