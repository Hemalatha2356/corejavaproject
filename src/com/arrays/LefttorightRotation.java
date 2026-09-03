package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Array rotation in left to right
//12345678
//reverse first of an array  r=2
//21345678
//reverse the second half of an array
//21876543
//eppudu reverse an array 
//34567821
public class LefttorightRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many times you are rotated : ");
		int r=sc.nextInt();
		int[]arr = {1,2,3,4,5,6,7,8};
		arrayrotation(arr,r);
		System.out.println("After rotation");
		System.out.println(Arrays.toString(arr));

	}
	static void arrayrotation(int[]arr,int r) {
		int start = 0;
		int end=arr.length-1;
		r=r%arr.length;
		
		//reverse first half array
		reversearray(arr,start,r-1);
		//reverse second half array
		reversearray(arr,r,end);
		//reverse full array
		reversearray(arr,start,end);
	}
	
	static void reversearray(int[]arr,int start, int end) {
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
