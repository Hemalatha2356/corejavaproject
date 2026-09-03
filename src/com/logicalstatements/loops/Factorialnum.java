package com.logicalstatements.loops;
//factorial of a given number? 
//5! -> 5*4*3*2*1=120
import java.util.Scanner;
public class Factorialnum {
	
	static void findfactorial(long n) {
		long fact=1;
		for(long i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of given number is  = " + fact);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		long n= sc.nextInt();
		findfactorial(n);
		
		

	}

}
