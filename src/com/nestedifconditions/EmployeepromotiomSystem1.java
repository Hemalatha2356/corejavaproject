package com.nestedifconditions;

import java.util.Scanner;
public class EmployeepromotiomSystem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your experience : ");
		int Experience = sc.nextInt();
		
		System.out.println("performance rating : ");
		int rating = sc.nextInt();
		
		System.out.println("Attendence : ");
		int attendence = sc.nextInt();
		
		System.out.println("manager Approval : ");
		boolean Approval = sc.nextBoolean();
		if(Experience>=3) {
			System.out.println("promotion granted ");
			if(rating>=5){
				System.out.println("it's very good company");
				if(attendence>=90) {
					System.out.println("the attendence is very good ");
					if(Approval) {
						System.out.println("the approval is granted");
					}else {
						System.out.println("the approval is not granted ");
					}
				}else {
					System.out.println("the attendence is not good");
				}
			}else {
				System.out.println("the rating is low");
			}
		}else {
			System.out.println("sorry promotion is not approval to you ");
		}
		

	}

}
