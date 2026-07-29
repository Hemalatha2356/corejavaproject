package com.nestedifconditions;

import java.util.Scanner;
public class EmployeepromotionSystem {

	public static void main(String[] args) {
		System.out.println("Welcome to vcube process");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("are you attend the daily classes? ");
		boolean dcstatus = sc.nextBoolean();
		
		System.out.println("are you attended the weekly test?");
		boolean wtStatus = sc.nextBoolean();
		
		System.out.println("attendence percentage..? ");
		int attendencepercentage = sc.nextInt();
		
		System.out.println("what is the marks percentage% ? ");
		Double marksp = sc.nextDouble();
		
		System.out.println("are you attending mockup interviews..? ");
		boolean mockinterview = sc.nextBoolean();
		
		System.out.println("hpw many mockup interviews attended..?");
		int mockattendence = sc.nextInt();
		if(dcstatus&&attendencepercentage>=80&&wtStatus&&marksp>=50.00&&mockinterview&&mockattendence>=95) {
			System.out.println("job confirm !! ");
		}else {
			System.out.println("sorry god will save you!! ");
		}
	}

}
