package com.fundamentals;

public class Employee1 {
	void Employeedetails() {
		System.out.println("Enter details");
	}
	void Employeedetails(String Name,int rollno) {
		System.out.println("Enter name : " + Name);
		System.out.println("enter rollno : " + rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 t1 = new Employee1();
		t1.Employeedetails();
		t1.Employeedetails("Hema", 1);

	}

}
