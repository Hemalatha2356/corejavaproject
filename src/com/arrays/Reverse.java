package com.arrays;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements : ");
		
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			 arr[i] = sc.nextInt();
		}
		System.out.println("reverse");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
