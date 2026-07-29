package com.logicalstatements;
//wap to find the given name can add to pan card detils..?
//the name should be not greater than in 15 characters
import java.util.Scanner;
public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started ");
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		if(name.length()>15) {
			
			System.out.println("your name yo lengthy,can you give in short name");
		
		}else {
			System.out.println("your name is adding to the pan details");
			
			System.out.println("main method ended : ");
		}

	}

}
