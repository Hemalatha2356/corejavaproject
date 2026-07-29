package com.nestedifconditions;

import java.util.Scanner;
public class JobportalApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started ");
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Qualification : ");
		String Qualification = sc.nextLine();
		
		System.out.println("Enter a percentage : ");
		double percentage = sc.nextDouble();
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("java knowledge : ");
		boolean knowledge = sc.nextBoolean();
		
		System.out.println("communication skills : ");
		boolean skills = sc.nextBoolean();
		
		System.out.println("Experience year ");
		int year = sc.nextInt();
		
		
		if(percentage>=70) {
			System.out.println("this is good for percentage ");
			if(age>=18&&age<=28) {
				System.out.println("age eligible ");
				if(knowledge) {
					System.out.println("good for knowledge");
					if(skills) {
						System.out.println("good for communcaion");
						if(year==0) {
							System.out.println("-------------------------");
							System.out.println("congratulations" + name +"!");
							System.out.println("your selected as a fresher.");
							System.out.println("----------------------");
						}else if(year>0) {
							System.out.println("------------------------------");
							System.out.println("congratulations" + name +"!");
							System.out.println("you are selected as an experienced candidate.");
							System.out.println("Experience : " + year+ "year");
						}
						else {
							System.out.println("invalid experience");
						}
					}else {
						System.out.println("rejected : not good for communcation ");
					}
				}else {
					System.out.println("rejected : not good for knowledge");
				}
			}
		}else {
			System.out.println("this is not good percentage ");
		}
		sc.close();
		
		

	}

}
