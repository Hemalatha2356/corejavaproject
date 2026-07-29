package com.logicalstatements;

//marks sign grades based on marks:

//A: 90–100
//B: 75–89
//C: 60–74
//D: 35–59
//F: Below 35
import java.util.Scanner;
public class TestDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entera marks");
		
		int marks = sc.nextInt();
		
		if(marks>100) {
			System.out.println("just passed");
		}
		else{
			
		}
		
	}

}
