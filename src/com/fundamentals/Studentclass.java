package com.fundamentals;

public class Studentclass {
	//static method
	static String SchoolName = "Srichaithanya";
	
	//instances variables
	int Studentid=9876;
	int StudentMarks=89;
	String StudentName="Hema";
	char gender='F';
	
	void display() {
		System.out.println("Studentid " + Studentid);
		System.out.println("StudentMarks" + StudentMarks);
		System.out.println("StudentName" + StudentName);
		System.out.println("gender" + gender);
		
		
	}
	static void dispalySchoolname() {
		System.out.println("SchoolName" + SchoolName);
		
	}
	

	public static void main(String[] args) {
		
		dispalySchoolname();
		
		Studentclass t1 = new Studentclass();
		
		t1.display();
		
	}

}
