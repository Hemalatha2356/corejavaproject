package com.fundamentals;

public class Student {
	void displayStudent() {
		System.out.println("Enter student details");
		
	}
	void displayStudent(String name, int rollno) {
		System.out.println("enter name " +name);
		System.out.println("enter roll no :  " + rollno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.displayStudent();
		s1.displayStudent("hema",1);

	}

}
