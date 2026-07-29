package com.constructor;

public class Student1 {
	String name;
	int rollno;
	String branch;
	double cgpa;
	String college;
	String city;
	long mobile;
	
	Student1(){
		System.out.println("no arg constructr called : ");
	}
	Student1(String name){
		System.out.println("one arg commstructor called : ");
		this.name=name;
	}
	Student1(String name,int rollno){
		System.out.println("two arg constructor called : ");
		this.name=name;
		this.rollno=rollno;
		
	}
	Student1(String name,int rollno,String branch){
		System.out.println("three arg constructor called : ");
		this.name=name;
		this.rollno=rollno;
		this.branch=branch;
	}
	Student1(String name,int rollno,String branch,double cgpa){
		System.out.println("four arg constructor called : ");
		this.name=name;
		this.rollno=rollno;
		this.branch=branch;
		this.cgpa=cgpa;
	}
	Student1(String name,int rollno,String branch,double cgpa,String college){
		System.out.println("five arg constructor called : ");
		this.name=name;
		this.rollno=rollno;
		this.branch=branch;
		this.cgpa=cgpa;
		this.college=college;
	}
	Student1(String name,int rollno,String branch,double cgpa,String college,String city){
		System.out.println("six arg constructor called : ");
		this.name=name;
		this.rollno=rollno;
		this.branch=branch;
		this.cgpa=cgpa;
		this.college=college;
		this.city=city;
		
	}
	
	Student1(String name,int rollno,String branch,double cgpa,String college,String city,long mobile){
		System.out.println("seven arg constructor called : ");
		this.name=name;
		this.rollno=rollno;
		this.branch=branch;
		this.cgpa=cgpa;
		this.college=college;
		this.city=city;
		this.mobile=mobile;
		
	}
	
	
	
	void info() {
		System.out.println("*************************************");
		System.out.println("Enter a name : " + name);
		System.out.println("Enter a rollnumber : " + rollno);
		System.out.println("Enter a branch : " + branch);
		System.out.println("Enter a cgpa : " + cgpa);
		System.out.println("Enter a college : " + college);
		System.out.println("Enter a city : " + city);
		System.out.println("Enter a mobile : " + mobile);
		System.out.println("*************************************");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1();
		s.info();
		Student1 s1 = new Student1("Hemalatha");
		s1.info();
		Student1 s2= new Student1("hema",12);
		s2.info();
		Student1 s3= new Student1("hema",12,"cse");
		s3.info();
		Student1 s4= new Student1("hema",12,"cse",8.5);
		s4.info();
		Student1 s5= new Student1("hema",12,"cse",8.5,"kits");
		s5.info();
		Student1 s6= new Student1("hema",12,"cse",8.5,"kits","guntur");
		s6.info();
		Student1 s7= new Student1("hema",12,"cse",8.5,"kits","guntur",9550234358L);
		s7.info();
		

	}

}
