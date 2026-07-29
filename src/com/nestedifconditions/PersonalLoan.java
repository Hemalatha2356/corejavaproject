package com.nestedifconditions;
//write a program to check multiple conditions based on the requriments
import java.util.Scanner;
public class PersonalLoan {

	public static void main(String[] args) {
		
		System.out.println("main method started :");
		System.out.println("welcome to v cube matrimonial site !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Welcome mr : " + name);
		
		System.out.println("Enter your assets");
		Double assets = sc.nextDouble();
		
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		if(assets>=50000000.00&&salary>=2500000.00) {
			System.out.println("okay !! Let started the discussion ");
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			
			if(age>=26&&age<=29) {
				System.out.println("ok good to goo");
				System.out.println("Enter your height : ");
				float height = sc.nextFloat();
				System.out.println("Enter your Weight : ");
				double weight = sc.nextDouble();
				if((height>=5.5&&height<=6.0)&&weight>=65&&weight<=75){
					
					System.out.println("ok wll dicuss more");
					System.out.println("do you drink or smoke..?");
					boolean habbitStatus = sc.nextBoolean();
					if(!habbitStatus) {
						System.out.println("ok cool || will discuss ");
						
						System.out.println("do you have siblings ");
						boolean sibStatus = sc.nextBoolean();
						if(!sibStatus) {
							System.out.println("ok good !! will meet soon");
							
						}else {
							System.out.println("oh my god");
						}
						
					}else{
						System.out.println("you can leave for the day!!");
					}
					
					
				}else {
					System.out.println("you must need to go toshort and too height ");
				}
			}
			else {
				System.out.println("sorry your age is not match with our profile!!");
			}	
		
		}else {
			System.out.println("you can leave for the day!!");
		}
	}
}
