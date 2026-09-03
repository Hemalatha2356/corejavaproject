package com.arrays;

import java.util.Scanner;
public class Searcharray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter a array size : ");
		int n =sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter a elements : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("search the element : ");
		int search = sc.nextInt();
		boolean found = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				found=true;
				
				System.out.println("element for the index  " + i + " : " + search);
			}
		}
		
		
		if(!found) {
			System.out.println("not found at the element  " + search);
		}	

	}

}
