package com.logicalstatements.loops;
import java.util.Scanner;
public class Neonnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n= sc.nextInt();
		
		boolean status = isneon(n);
		if(status){
			System.out.println("Neon number ");
		}else {
			System.out.println("not neon number ");
		}
	}
	
	static boolean isneon(int n){
		boolean status=false;
		int sum=0;
		int square=n*n;
		int digit=0;
		
		while(square>0) {
			digit=square%10;
			sum=sum+digit;
			square=square/10;
		}
		
		if(sum==n) {
			return true;
		}
		return status;
		
	}

}
