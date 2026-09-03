package com.arrays;

public class Transposematrix {

	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6}};
		
		int rows=arr.length;
		int col=arr[0].length;
		
		int[][] transpose  = new int[col][rows];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				transpose[j][i]=arr[i][j];
			}
		}
		//transpose matrix
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[i].length;j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}

}
