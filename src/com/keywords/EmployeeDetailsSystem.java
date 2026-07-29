package com.keywords;

public class EmployeeDetailsSystem {
	int Employeeid=342;
	String EmployeeName="Hema";
	int age=23;
	char gender='F';
	String Department="HR";
	double salary=8976789;
	int Experience=2;
	String Designation="Software engineer";
	public static void main(String[] args) {
		EmployeeDetailsSystem s1 = new EmployeeDetailsSystem();
		
		System.out.println(s1.Employeeid);
		
		System.out.println(s1.EmployeeName);
		
		System.out.println(s1.age);
		System.out.println(s1.gender);
		
		System.out.println(s1.Department);
		System.out.println(s1.salary);
		
		System.out.println(s1.Experience);
		System.out.println(s1.Designation);
		
		
	}

}
