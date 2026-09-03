package com.arrays;

public class Transposematrix1 {
// transpose matrix
//	1 2 3 
//	4 5 6
//	7 8 9

	public static void main(String[] args) {
		
		int [][] arr = { {1,2,3}, {4,5,6},{7,8,9}};
		
		int row=arr.length;
		int col=arr[0].length;
		
		int [][] transpose = new int[col][row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				transpose[j][i]=arr[i][j];
			}
			
		}
		//transpose matrix print 
		
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[i].length;j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
		
		
	

	}

}
