package com.arrays;

import java.util.Scanner;

public class Secondmin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int secondmin=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondmin=min;
				min=arr[i];
			}
			else if(arr[i]<secondmin && arr[i]!=min) {
				secondmin=arr[i];
			}
		}
		System.out.println("minimum number of : " + min);
		System.out.println("second minimum of : " + secondmin);
		
	

	}

}
