package com.logicalstatements;

public class Smallestnum {

	public static void main(String[] args) {
		int num1=34;
		int num2=23;
		int num3=43;
		System.out.println("Enter a number : ");
		if(num1<num2&&num1<num3) {
			System.out.println("smallest number num1 : " + num1);
			
		}
		else if(num2<num1&&num2<num3){
			System.out.println("smallest num2 "+ num2);
		}
		else {
			System.out.println("smallest num3: " + num3);
		}
		
		

	}

}
