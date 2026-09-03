package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//rotation of an array 
//12345678
//output is 56781234
//first reverse an array 
//87654321
//rotated in first half array
//56784321
//rotated in Second half array
//56781234
public class Rotationofarray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how many time array are rotated !!");

		int r = sc.nextInt();
		int [] arr = {1,2,3,4,5,6,7,8};
		arrayrotation(arr, r);
		
		System.out.println("After rotated : ");
		System.out.println(Arrays.toString(arr));
		
	}
	static void arrayrotation(int [] arr, int r) {
		int start = 0;
		int end = arr.length-1;
		r=r%arr.length;
		//reverse full array
		//87654321
		reversearray(arr,start,end);
		//reverse half array
		reversearray(arr,start,r-1);
		//reverse half array
		reversearray(arr,r,end);
		
	}
	
	static void reversearray(int[] arr,int start,int end) {
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

}
