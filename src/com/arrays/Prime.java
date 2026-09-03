package com.arrays;

import java.util.Scanner;
public class Prime {
	static boolean isprime(int n) {
		boolean status = true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers : ");
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(isprime(arr[i])) {
				
				System.out.println(arr[i]);
			}
			
		}
	

	}

}
