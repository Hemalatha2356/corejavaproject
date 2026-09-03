package com.logicalstatements.loops;
import java.util.Scanner;
//wap factorial of a given number using recurision
public class Factorial {
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return fact(n-1) * n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int fact=fact(n);
		System.out.println("Factorial of " + n + "  is: " + fact);


	}

}
