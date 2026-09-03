package com.arrays;
//insection sorting
import java.util.Arrays;
public class Insectionsort {

	public static void main(String[] args) {
		int [] arr = {3,2,5,1,6};
		int temp=0;
		int j=0;
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			j=i;
			
			while(j>0&&arr[j-1]>temp){
				arr[j]=arr[j-1];
				j=j-1;
			}
	
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
