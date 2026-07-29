package com.methods;

public class Student {
	int stu_id;
	String stu_name;
	Student(){
	stu_id=10;
	stu_name="hello";
		System.out.println("no args constructor called : ");
	}
	
	Student(int id,String name){
		this.stu_id = id;
		this.stu_name=name;
		
		System.out.println("parameterized constructuor : ");
	}
	
	void display() {
		System.out.println("student id : " + stu_id);
		System.out.println("student name : " + stu_name);
	}
	
	public static void main(String[] args) {
		Student t1 = new Student();
		t1.display();
		Student s1 = new Student(101,"hema");
		s1.display();
		

	}


		
}

