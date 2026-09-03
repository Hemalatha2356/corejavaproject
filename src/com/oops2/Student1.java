package com.oops2;

public class Student1 {
	
	String name;
	Course course;
	
	Student1(String name,Course course){
		this.name=name;
		this.course=course;
	}
	Student1(Student1 s){
		this.name=s.name;
		this.course=new Course(s.course.branch);
	}

	public static void main(String[] args) {
		Course c1 = new Course("CSE");
		
		Student1 s1 = new Student1("Hema",c1);
		Student1 s2 = new Student1(s1);
		
		s1.course.branch="EEE";
		
		System.out.println("original" + s1.course.branch);
		System.out.println("copied " + s2.course.branch);

	}

}
