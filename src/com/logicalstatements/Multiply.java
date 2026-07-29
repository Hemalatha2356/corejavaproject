package com.logicalstatements;

public class Multiply {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int num=10;
		if(num%2==0&&num%5==0) {
			System.out.println("multiply by both 2 and 5 : " + num);
		}
		
		else {
			System.out.println("not multiply by both : " +num);
		}

	}

}
