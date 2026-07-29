package com.fundamentals;

public class EmployeeSystem {
	//static variables
	
	static String companyname= "HCL";
	//instances variables
	int empid=987;
	String empname="Hema";
	String empdept="HR";
	double empsalary=56789;
	double bouns=6789;
	int totalSalary;
	
	
	//instance method1
	void diaplay() {
		
		System.out.println("empid " + empid);
		System.out.println("empname " + empname);
		System.out.println("empdept " + empdept);
		System.out.println("empsalary " + empsalary);
		System.out.println("bouns " + bouns);
	}
	//instance method2
	void calculateSalary(){
		double totalSalary = empsalary+bouns;
		System.out.println("totalSalary: " + totalSalary);
	}
	
	
	
	static void displayCompanyName(){
		System.out.println("companyname" + companyname);
	}
	public static void main(String[] args) {
		
		
		displayCompanyName();
		 EmployeeSystem t1=new  EmployeeSystem();
		 t1.diaplay();
		 t1.calculateSalary();

	}
	
}
