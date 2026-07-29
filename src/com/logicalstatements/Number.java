package com.logicalstatements;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started : ");
		System.out.println("Enter a first number : ");
		int number1 = sc.nextInt();
		System.out.println("Enter a second number : ");
		int number2 = sc.nextInt();

		
		
		if(number1>number2 && number1<number2) {
			System.out.println("num 1 is greater : " + number1);
			
		}
		else {
			System.out.println("number 2 is greater : " + number2);
		}

	}

}
