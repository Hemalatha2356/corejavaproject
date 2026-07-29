package com.operators;
//Assignment operator 
public class Operators1 {
	public static void main(String[] args) {
		System.out.println("main method started : ");
		
		
		int result = 10;
		
		//type mismatch: cannot convert from double to int
		//result=result+4.5;
		//result= (int)(a + 4.5);
		
		result += 4.5;//component operators
		result -= 3.5;
		result *= 2.5;
		System.out.println(result);//Narrowing
	
		
		

	}
	
	
	
}
