package com.arrays;

public class Searchingelement {
//	1 2 3 
//	4 5 6
//	7 8 9

	public static void main(String[] args) {
		int [][] arr = new int[3][3];
		
		arr[0][0]=1;//no
		arr[0][1]=2;//no
		arr[0][2]=3;//no
		
		arr[1][0]=4;//no
		arr[1][1]=5;//yes
		arr[1][2]=6;
		
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		
		int search=5;
		
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr[i].length;j++) {
				if(arr[i][j]==search) {
					System.out.println("row of " + i );
					System.out.println("col of " + j );
					
				}
				
			}
		}

	}

}
