package com.constructor;

public class Employee {
	
	int empid=103;
	String name="latha";
	String dept="cse";
	double sal=4567890;
	String company="infosy";
	String loc="hyd";
	String desig="ggfghh";
	
	Employee(){
		System.out.println("no arg constructor called ");
	}
	Employee(int empid){
		System.out.println("one arg constructor called : ");
		this.empid=empid;
	}
	Employee(int empid,String name){
		System.out.println("two arg constructor called : ");
		this.empid=empid;
		this.name=name;
	}
	Employee(int empid,String name,String dept){
		System.out.println("three arg constructor called : ");
		this.empid=empid;
		this.name=name;
		this.dept=dept;
	}
	Employee(int empid,String name,String dept,double sal){
		System.out.println("four arg constructor called : ");
		this.empid=empid;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		
	}
	Employee(int empid,String name,String dept,double sal,String company){
		System.out.println("five arg constructor called : ");
		this.empid=empid;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		this.company=company;
		
	}
	
	Employee(int empid,String name,String dept,double sal,String company,String loc){
		System.out.println("six arg constructor called : ");
		this.empid=empid;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		this.company=company;
		this.loc=loc;
		
	}
	Employee(int empid,String name,String dept,double sal,String company,String loc,String desig){
		System.out.println("seven arg constructor called : ");
		this.empid=empid;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		this.company=company;
		this.loc=loc;
		this.desig=desig;
		
	}
	void empinfo() {
		System.out.println("************************************");
		System.out.println("Employee id : " + empid);
		System.out.println("Employee name : " + name);
		System.out.println("Employee dept : " + dept);
		System.out.println("Employee sal : " + sal);
		System.out.println("Employee company : " + company);
		System.out.println("Employee loc : " + loc);
		System.out.println("Employee desig : " + desig);
		System.out.println("************************************");
	}
	
	
	
	


	public static void main(String[] args) {
		System.out.println("main method started : ");
		Employee e = new Employee();
		e.empinfo();
		
		Employee e1 = new Employee(101);
		e1.empinfo();
		Employee e2 = new Employee(101,"Hema");
		e2.empinfo();
		Employee e3 = new Employee(101,"Hema","HR");
		e3.empinfo();
		Employee e4 = new Employee(101,"Hema","HR",5678988);
		e4.empinfo();
		Employee e5 = new Employee(101,"Hema","HR",5678988,"TCS");
		e5.empinfo();
		Employee e6 = new Employee(101,"Hema","HR",5678988,"TCS","hyd");
		e6.empinfo();
		Employee e7 = new Employee(101,"Hema","HR",5678988,"TCS","hyd","kolksata");
		e7.empinfo();
		
	}

}
