package com.nestedifconditions;

import java.util.Scanner;
public class Jobportal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started ");
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your qualifications : ");
		String Qualification = sc.nextLine();
		System.out.println("Enter your percentage : ");
		double percentage = sc.nextDouble();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter java knowledge(true/false)");
		boolean knowledge = sc.nextBoolean();
		System.out.println("communcation skills(true/false)");
		boolean skills = sc.nextBoolean();
		System.out.println("Experience year : ");
		int year = sc.nextInt();
		
		if(Qualification.equalsIgnoreCase("Btech")) {
			System.out.println("qualification is eligible ");
			if(percentage>=70) {
				System.out.println("percentage is good");
				if(age>=18&&age<=28) {
					System.out.println("the age is eligible ");
					if(knowledge) {
						System.out.println("Excllent");
						if(skills) {
							System.out.println("communcation is good");
							if(year==0) {
								System.out.println("-----------------------");
								System.out.println("contratations" + name+"!!");
								System.out.println("your are selected for fresher");
							}else if(year>0) {
								System.out.println("-------------------------");
								System.out.println("congrants" + name +"!");
								System.out.println("your are selected for experiences");
							}else {
								System.out.println("invalid experience");
							}
						}else {
							System.out.println("rejected : the communcation is not good");
						}
					}else {
						System.out.println("the knowledge is not good");
					}
				}else {
					System.out.println("rejected: the age is not eligible");
				}
			}else {
				System.out.println("rejected: the percentage is minimum 70% ");
			}
		}else {
			System.out.println("rejected: only btech candiates are eligible ");
		}
		

	}

}
