package com.logicalstatements.loops;
import java.util.Scanner;
public class Reversenum {
	static int reversenumber(int n) {
		int rn=0;
		
		int r=0;
		while(n>0) {
			rn=n%10;//123->123%10=3,
			n=n/10;
			r=r*10+rn;
		}
		return r;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");//123
		int n = sc.nextInt();
		
		int reversenumber=reversenumber(n);
		
		System.out.println("the given number is reversenumber : " + reversenumber);

	}

}
