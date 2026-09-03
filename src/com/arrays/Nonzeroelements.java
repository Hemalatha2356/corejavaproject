package com.arrays;
//wap the given program is [0,1,3,0,12] the zeroes are moved in last postion 
import java.util.Scanner;
public class Nonzeroelements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		System.out.println("Enter 5 elements : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//non1-zero elements are placed j=0;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		
		}
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		
		System.out.println("After moving zeroes to the end:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
