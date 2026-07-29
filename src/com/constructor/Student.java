package com.constructor;

public class Student {
	int sid;
	String sname;
	String course;
	int marks;
	Student(){
		System.out.println("no arg constructor : ");
		sname="kavya";
		sid=89;
		course="cse";
		marks=90;
	}
	Student(int sid,String course,String sname,int marks){
		System.out.println("********parameterized constructor*********");
		this.sid=sid;
		this.course=course;
		this.sname=sname;
		this.marks= marks;
	}
	
	void display() {
		System.out.println("student id : " + sid);
		System.out.println("course name :" + course);
		System.out.println("student name : " + sname);
		System.out.println("student marks : " + marks);
	}

	public static void main(String[] args) {
	Student s = new Student();
	s.display();
	Student s1 = new Student(101,"hema","cse",89);
	s1.display();

	}

}
