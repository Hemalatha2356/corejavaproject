package com.constructor;


public class Employee1 {
	int empid;
	String name;
	String dept;
	double sal;
	//parameterized constructor called 
	Employee1(int empid,String name,String dept,double sal){
		
		System.out.println("emp parameterized constructor called : ");
		this.empid=empid;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		
	}
	
	Employee1(Employee1 e){
		System.out.println("copy consrtuctor called : ");
		this.empid=e.empid;
		this.name=e.name;
		this.dept=e.dept;
		this.sal=e.sal;
		
	}
	
	void empinfo() {
		System.out.println("Employee id : " + empid);
		System.out.println("Employee name : " + name);
		System.out.println("Employee dept : " + dept);
		System.out.println("Employee sal : " + sal);
	}

	public static void main(String[] args) {
		System.out.println("main method called : ");
		
		Employee1 e = new Employee1(101,"hema","cse",89878868);
		e.empinfo();
		Employee1 e1 = new Employee1(e);
		
		e1.sal=e1.sal+50000;

		e1.empinfo();
		

	}

}
