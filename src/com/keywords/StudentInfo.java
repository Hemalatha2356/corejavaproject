package com.keywords;

import java.util.Scanner;

public class StudentInfo {
	//primitive datatypes
	int rollNumber=12;
	int age=21;
	char Gender='F';
	String section="c";
	int marks=98;
	int english=99,
	telugu=99,
	maths=87,
	java=89,
	python=89;
	int totalmarks=100;
	float percentage=98;

	
	//Non- primitive datatypes
	String studentName = "Hema";
	String passedStatus="passed";
	String Grade="A";
	

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		StudentInfo t1=new StudentInfo();
		
		System.out.println(t1.rollNumber);
		
		System.out.println(t1.age);
		
		System.out.println(t1.Gender);
		
		System.out.println(t1.section);
		
		System.out.println(t1.marks);
		
		System.out.println("Enter 5 subjects");
		
		System.out.println(t1.english);
		
		System.out.println(t1.telugu);
		System.out.println(t1.maths);
		System.out.println(t1.java);
		System.out.println(t1.python);
		
		System.out.println(t1.totalmarks);
		
		System.out.println(t1.percentage);
		
		System.out.println(t1.studentName);
		
		System.out.println(t1.passedStatus);
		
		System.out.println(t1.Grade);
		
		
		
	}

}
