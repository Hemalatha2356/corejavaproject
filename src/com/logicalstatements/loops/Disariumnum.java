package com.logicalstatements.loops;

import java.util.Scanner;
public class Disariumnum {
	static boolean isDisarium(int n) {
		boolean status = false;
		int sum=0;
		int count=0;
		int temp=n;
		int digit=0;
		//number of digit count
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=n;
		while(temp>0) {
			digit=temp%10;
			
			sum=sum+(int)Math.pow(digit,count);
			count--;
			temp=temp/10;
		}
		if(sum==n) {
		return true;
	}
	 return false;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");//135
		int n = sc.nextInt();
		isDisarium(n);
		if(isDisarium(n)) {
			System.out.println("disarium number ");
		}else {
			System.out.println("not disarium number");
		}

	}

}
