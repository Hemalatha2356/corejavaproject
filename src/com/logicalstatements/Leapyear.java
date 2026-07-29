package com.logicalstatements;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started : ");
		System.out.println("Enter a year : ");
		int year = sc.nextInt();
		if((year%400==0) || (year%4 == 0&&year != 100)){
			System.out.println("leap year : ");
			
		}
		else {
			System.out.println("not leap year : ");
		}

	}

}
