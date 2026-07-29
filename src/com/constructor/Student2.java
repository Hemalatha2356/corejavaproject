package com.constructor;

public class Student2 {
	
	int rollno;
	String name;
	String branch;
	double cgpa;
	
	Student2(){
		System.out.println("default constructor : ");
	}
	
	Student2(int rollno,String name,String branch,double cgpa){
		System.out.println("student parameterized constructor called : ");
		this.rollno=rollno;
		this.name=name;
		this.branch=branch;
		this.cgpa=cgpa;
		
	}
	
	Student2(Student2 s){
		System.out.println("copy constructor called : ");
		this.rollno=s.rollno;
		this.name=s.name;
		this.branch=s.branch;
		this.cgpa=s.cgpa;
		
	}
	
	void info() {
		System.out.println("Student rollno : " + rollno);
		System.out.println("Student name : " + name);
		System.out.println("Student branch : " + branch);
		System.out.println("Student cgpa : " + cgpa);
	}

	public static void main(String[] args) {
		System.out.println("main method started : ");
		Student2 s = new Student2();
		s.info();
		Student2 s1 = new Student2(101,"Hema","cse",8.5);
		s1.info();
		Student2 s2 = new Student2(s1);
		s2.info();

	}

}
