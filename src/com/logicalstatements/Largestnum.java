package com.logicalstatements;
public class Largestnum {

	public static void main(String[] args) {
		int num1=34;
		int num2=89;
		int num3=53;
		System.out.println("main method started : ");
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("greater than num1  : "+ num1);
		}
		else if(num2>num1&&num2>num3){
			System.out.println("greater than num2 : " + num2);
			
		}
		else {
			System.out.println("number 3 " + num3);
		}
			
		
		
	}

}
