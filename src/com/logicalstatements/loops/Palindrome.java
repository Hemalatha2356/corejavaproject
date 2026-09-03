package com.logicalstatements.loops;
import java.util.Scanner;
public class Palindrome {
	
static boolean ispalindrome(int n) {
		
		boolean status=false;
	
		int temp=n;
		int rev=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
			
		}
		
		if(temp == rev) {
			status = true;
		}
		return status;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean status = ispalindrome(n);
		
		if(status) {
			System.out.println("the given number is plaindrome!!");
		}else {
			System.out.println("the given number is not palindrome!!");
		}
	}
}