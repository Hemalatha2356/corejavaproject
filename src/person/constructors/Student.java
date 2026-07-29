package person.constructors;


public class Student extends Person{
	String branch;
	int rollno;
	Student(){
		this("cse",101);
		System.out.println("default constructor called  : ");
	}
	
	Student (String branch,int rollno){
		super("hema",21);
		this.branch=branch;
		this.rollno=rollno;
		System.out.println("student parameterized constructor called : ");
	}
	
	void display() {
		System.out.println("********************************************************");
		System.out.println("Name : " + name);
		System.out.println("age : " + age);
		System.out.println("branch : " + branch);
		System.out.println("rollno : " + rollno);
	}
}
	