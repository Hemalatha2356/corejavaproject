package com.arrays;
import java.util.Scanner;
public class Secondlargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max=arr[0];
		int secondmax=arr[0];
		//input
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			//else if purpose second maximum ni update cheyyadam.
			else if (arr[i]>secondmax && arr[i]!=max) {//second max kii
				secondmax=arr[i];
			}
			
		}
		System.out.println(" maximum are : " + max);
		System.out.println("second maximum are : " + secondmax);
		

	}

}
