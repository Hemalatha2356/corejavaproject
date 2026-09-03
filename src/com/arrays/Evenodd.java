package com.arrays;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size : ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter an elements : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
				even++;
			}
			else {
				odd++;
			}
			
		}
		System.out.println("even " + even);
		System.out.println("odd " + odd);

	}

}
