package com.methods;

public class StudentresultAnalyzer {
	double calculatetotal(double m1,double m2,double m3,double m4,double m5) {
		double calculatetotal = m1+m2+m3+m4+m5;
		return calculatetotal;
	}
	double calculatepercentage(double total) {
		double calculatepercentage = total/500*100;
		return calculatepercentage;
		
	}
	double calculateAverage(double total) {
		double calculateAverage = total/5.0;
		return calculateAverage;
	}

	public static void main(String[] args) {
		StudentresultAnalyzer s1 = new StudentresultAnalyzer();
		System.out.println("Enter a marks");
		
		double total = s1.calculatetotal(67,89,68,45,66);
		
		System.out.println("enter total marks : "+total);
		
		double result1 = s1.calculatepercentage(total);
		System.out.println("percentage " + result1 + "%");
		double avg = s1.calculateAverage(total);
		System.out.println("average " + avg);
		

	}

}
