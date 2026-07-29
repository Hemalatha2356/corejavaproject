package com.methods;
import java.util.Scanner;
public class Selfdetails {
	Scanner sc = new Scanner(System.in);
	String name;
	String mothername;
	String fathername;
	String brothername;
	int address;
	private String status;
	
	void familydetails() {
		
		System.out.println("---------Enter family details--------");
	}
	void familydetails1() {
		name="hemalatha";
		fathername="srinivasreddy";
		mothername="nahalaxshmi";
		brothername="sivareddy";
		System.out.println(name);
		System.out.println("fathername : " + fathername);
		System.out.println(mothername);
		System.out.println(brothername);
	}
	void employeedetails(int id,String name) {
		
		System.out.println("Employee id : " + id);
		System.out.println("empliyeename :  " + name );
		
	}
	void address() {
		
		System.out.println("-----adress----------" + address);
	}
	void marksdetails(int marks ){
		System.out.println("-----------marks--------------------");
		System.out.println("telugu marks : " + marks);
		System.out.println("maths marks : " + marks);
	}
	void attendences(float attendence) {
		System.out.println("attendence : " + attendence);
	}
	void sem1result(double result) {
		System.out.println("semister marks " + result);
		System.out.println("semister 1 is : " + result);
	}
	void sem2result(int result) {
		System.out.println("sem2 is : " + result);
	}
	void sem3result(double result) {
		System.out.println("sem3 is : " + result);
	}
	void sem4result(double result) {
		System.out.println("sem4 id : " + result);
	}
	void sem5result(double result) {
		System.out.println("sem5 is :80");
	}
	void getbankdetails() {
		System.out.println("-----bankdetails-----------");
	}
	void getcustomerid(int id) {
		System.out.println("customer id : " + id);
	}
	void getbalance(double balance) {
		System.out.println("current balance : " + balance);
	}
	
	void getmoviedetails() {
		System.out.println("----------movie details------------");
	}
	void gettiming(int time) {
		System.out.println("Enter timing details ");
	}
	void getseatbooking(int booking) {
		System.out.println("seating booking : " );
	}
	void payment() {
		System.out.println("------payment successfully--------");
	}
	void getconformation() {
		System.out.println("============booking comformation========");
	}
	void restaurantDetails() {
		System.out.println("===========restaurant details=========");
	}
	void getmenu(String menu) {
		System.out.println("briyani");
	}
	void placeorder(String details) {
		System.out.println("Enter order details : " + details);
	
	}
	void getbill(int bill) {
		System.out.println("bill = 4000");
	}
	void deliverystatus() {
		System.out.println("tooo good" + status);
	}
	void display() {
		System.out.println("fathername" + fathername);
	}
	
	public static void main(String[] args) {
		
		
		Selfdetails t1 = new Selfdetails();
		//method calling
		t1.familydetails();
		t1.familydetails1();
		t1.address();
		t1.employeedetails(101,"hema");
		t1.marksdetails(10);
		 t1.attendences(78);
		 t1.sem1result(89);
		 t1.sem2result(89);
		 t1.sem3result(456);
		 t1.sem4result(46);
		 t1.sem5result(80);
		 t1.getbankdetails();
		 t1.getconformation();
		 t1.payment();
		 t1.gettiming(7);
		 t1.getbalance(80000);
		 
		 t1.getcustomerid(8);
		 t1.restaurantDetails();
		 t1.getmenu("briyani");
		 t1.placeorder("guntur");
		 t1.getbill(799);
		 t1.deliverystatus();
		
		 
		 
		 

	}

}
