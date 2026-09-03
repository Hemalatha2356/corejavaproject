package com.logicalstatements.loops;
import java.util.Scanner;
public class Perfectno {
	
	
	static boolean isperfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		boolean status = isperfect(n);
		if(status) {
			
			System.out.println("the given number is perfect ");
		}else {
			System.out.println("the given number is not perfect");
		}
		

	}
	
	

}
