package com.methods;
//no return type & no arguments
public class TestDemo4 {
	String hospital;
	int id;
	String name;
	double sal;
	String hr;
	double carcost;
	double bill;
	String passgener;
	String express;
	int seatnumber;
	int marks;
	String subname;
	int timing=7;
	int classtime;
	String facname;
	int facid;
	String facdept;
	String deptname;
	 double deptid;
	 double deptcode;
	
	void hospitaldetails() {
		hospital = "bhjhj";
		id = 67;
		System.out.println("hospital name : " + hospital);
		System.out.println("hospital id : " + id);
	}
	void doctordetails() {
		name = "hema";
		sal = 56789;
		System.out.println("doctor name : " + name);
		System.out.println("doctor sal: " + sal);
	}
	void companydetails() {
		hr = "hema";
		System.out.println("company hr  : "  + hr);
	
	}
	void cardetails() {
		carcost = 56787;
		System.out.println("car cost : " + carcost);
	}
	void waterbill() {
		bill = 9879;
		System.out.println("water bill + " + bill);
	}
	void traindetails() {
		passgener = "hema";
		seatnumber = 38;
		express = "palanadu";
		System.out.println("passenger name : " + passgener);
		System.out.println("seat number + " + seatnumber);
		System.out.println("train express : " + express);
		
	}
	void examSchedule1(){
		timing = 7;
		marks=80;
		subname="java";
		System.out.println("examtiming : " + timing);
		System.out.println("marks : " + marks);
		System.out.println("subject name : " + subname);
		
		
	}
	void classTimings1() {
		classtime = 8;
		System.out.println("class timing : " + classtime);
	}
	void facultyDetails1() {
		facname = "hema";
		facid = 6789;
		facdept = "CSE";
		System.out.println("facutly name : " + facname);
		System.out.println("facutly id " + facid);
		System.out.println("faculty dept : " + facdept);
	}
	void departmentDetails4() {
		deptname = "ece";
		deptid = 5678908;
		deptcode = 797565890;
		System.out.println("dept name : " + deptname);
		System.out.println("deptid : " + deptid);
		System.out.println("deptcode : " + deptcode);
	}
	void studentdetails(int id,String name) {
		System.out.println("student id : " + id);
		System.out.println("student name : " + name);
		
	}
	void employeedetails(double sal, int id) {
		System.out.println("employee sal : " + sal);
		System.out.println("employee id : " + id);
	}
	void doctordetails(int doctorid, String name) {
		System.out.println("doctor id : " + doctorid);
		System.out.println("doctor name : " + name);
	}
	void patenitdetails(int patentid,String name) {
		System.out.println("petenit id " + patentid);
		System.out.println("patent name " + name);
	}
	void resturantOrder(String Ordername , int quality) {
		
		System.out.println("ordername : " + Ordername);
		System.out.println("food quality : " + quality);
	}
	void hotelbooking(String roomtype,int days) {
		System.out.println("room type : " + roomtype);
		System.out.println("how many days : " + days);
	}
	String cityName() {
		 String cityName = "hyd";
		 System.out.println("city name : " + cityName);
		 
		 return cityName;
	}
	double temperature() {
		double temperature = 9;
		System.out.println("temperature : " + temperature);
		return temperature;
	}
	
	
	int addNumber(int a,int b) {
		int Number = a + b;
		System.out.println("add numners : " + Number);
		return Number;
	}

	
	

	public static void main(String[] args) {
		TestDemo4 s1 = new TestDemo4();
		s1.hospitaldetails();
		s1.doctordetails();
		s1.companydetails();
		s1.cardetails();
		s1.waterbill();
		s1.traindetails();
		
		s1.examSchedule1();
		s1.classTimings1();
		s1.facultyDetails1();
		s1.departmentDetails4();
		s1.studentdetails(40, "hema");
		s1.employeedetails(678998, 68);
		s1.doctordetails(39, "latha");
		s1.patenitdetails(43, "ganga");
		
		s1.resturantOrder("briyani",45);
		s1.hotelbooking("3bhk", 9);
		s1.temperature();
		s1.cityName();
		s1.addNumber(10, 30);
		
		

	}

}
