package com.arrays;

import java.util.Scanner;

public class SearchArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a elements : ");
		
		int[] arr = {10,20,30,40,50};
		
		
		System.out.println("search element  : ");
		int search=sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				found=true;
				System.out.println("element of the index  "+ i + " : " + search);
			}
			
		}
		
		if(!found) {
			System.out.println("not element for the index " + search);
		}

	}

}
