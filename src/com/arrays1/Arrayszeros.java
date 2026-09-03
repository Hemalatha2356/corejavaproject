package com.arrays1;

public class Arrayszeros {
	
//	1 1 0
//	1 1 1
//	0 1 0
// if the condtion is one row and one col is zero it becomes all row and col zero
	

	public static void main(String[] args) {
		int [][] arr = new int[3][3];
		
		arr[0][0]=1;
		arr[0][1]=1;
		arr[0][2]=0;
		
		arr[1][0]=1;
		arr[1][1]=1;
		arr[1][2]=1;
		
		arr[2][0]=0;
		arr[2][1]=1;
		arr[2][2]=0;
		
		
		
		int row=arr.length;
		int col=arr[0].length;
		boolean []zerorow = new boolean[row];
		boolean [] zerocol = new boolean[col];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==0) {
					zerorow[i]=true;
					zerocol[j]=true;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(zerorow[i]||zerocol[j]) {
					arr[i][j]=0;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}

	}

}
