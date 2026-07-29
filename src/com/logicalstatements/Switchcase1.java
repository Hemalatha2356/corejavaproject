package com.logicalstatements;

import java.util.Scanner;
public class Switchcase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number : ");
		double a = sc.nextDouble();
		
		System.out.println("Enter a second number : ");
		double b= sc.nextDouble();
		
		System.out.println("Enter a symbol to proceed like + - * / %");
		String symb = sc.next();
		
		double result = 0;
		
		//cannot switch on a valuesof type double.
		//only convertible int values, string or enum variables are permitted.
		switch(symb) {
		case "+" -> result = a+b;
		case "=" -> result = a-b;
		case "*" -> result = a*b;
		case "/" -> result = a/b;
		case "%" -> result = a%b;
		
		default ->
		{
			result = 0;
			System.out.println("invalid symobol to proceed !!");
		}
		}
		
		System.out.println("Result is : " + result);
		
		

	}

}
