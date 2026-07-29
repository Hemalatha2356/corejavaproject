package com.logicalstatements;

import java.util.Scanner;
public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started ");
		System.out.println("Enter a person age : ");
		int age = sc.nextInt();
		if(age<12) {
			System.out.println("chlid : " + age);
		}
		else if(age<=59){
			System.out.println("Adult : " + age);
			
		}
		else {
			System.out.println("senior citizen ");
		}
		

	}

}
