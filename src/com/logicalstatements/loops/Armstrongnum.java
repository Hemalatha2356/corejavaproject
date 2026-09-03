package com.logicalstatements.loops;

import java.util.Scanner;
public class Armstrongnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		boolean status = isarmstrong(n);
		
		if(status) {
			System.out.println("the given number is armstrong!!");
		}else {
			System.out.println("the given number is not armstrong!!");
		}
		sc.close();
		
	}
	
	static boolean isarmstrong(int n) {
		boolean status=false;
		int sum=0;
		int r=0;
		int temp=n;
		int count=0;
		int n1=n;
		
//		String str = Integer.toString(n);//1634
//		int digitCount = str.length();//4
//		while(n1>0) {
//			n1=n1/10;
//			count++;
//		}
		
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
//			sum=(int) (sum+Math.pow(r,count));
		}
		
			if(sum==temp) {
				status = true;
			}
			
		return status;
		
	}

}
