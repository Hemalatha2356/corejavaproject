package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Bubblesortasc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {5, 2, 8, 1, 3}; 
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		int temp=0;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After soting");
		System.out.println(Arrays.toString(arr));
		

	}

}
