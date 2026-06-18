package com.fundamentals;

public class Employee {
	//instances variables
	int Emid;
	String Ename;
	int Salary;
	//static variables
	static String Dept= "CSE";
	
	public static void main(String[] args) {
		System.out.println("********** Welcome");
		System.out.println(Dept);
		
		
		
		//Instance variable its create a object
		Employee Student = new Employee();
		
		Student.Emid=2345;
		Student.Ename="Hema";
		Student.Salary=43253;
		
		System.out.println(Student.Emid);
		System.out.println(Student.Ename);
		System.out.println(Student.Salary);
		
		Employee E1 = new Employee();
		
	
		E1.Emid=2342;
		E1.Ename="Latha";
		E1.Salary = 23245;
		System.out.println(E1.Emid);
		System.out.println(E1.Ename);
		System.out.println(E1.Emid);
		
		
	

	}

}
