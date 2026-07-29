package com.constructor;

public class Employee2 {
	int empid;
	String empname;
	double salary;
	
	Employee2(){
		System.out.println("default constructor : ");
	}
	Employee2(int empid,String empname,double salary){
		System.out.println("parameterized constructor called : ");
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		
		
	}
	Employee2(Employee2 e,double increment){
		System.out.println("copy constructor called : ");
		this.empid=e.empid;
		this.empname=e.empname;
		this.salary=e.salary+increment;
		
	}
	
	void info() {
		System.out.println("empid : " + empid);
		System.out.println("empname : " + empname);
		System.out.println("salary : " + salary);
	}

	public static void main(String[] args) {
		Employee2 e = new Employee2(101,"hema",80000);
		e.info();
		
		Employee2 e1 = new Employee2(e,5000);
		System.out.println("copied obj");
		e1.info();
		

	}

}
