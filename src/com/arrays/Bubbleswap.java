package com.arrays;

import java.util.Arrays;

public class Bubbleswap {

	public static void main(String[] args) {
		int[] arr = {5,1,4,2,8};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arr));
		int temp=0;
		int swap=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap++;
					
				}
			}
		}
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("swaping is " + swap);

	}

}
