package com.nestedifconditions;

public class Smarks {

	public static void main(String[] args) {
		int Studentmarks=45;
		int attendence=8;
		if(Studentmarks>=35) {
			if(attendence>=75) {
				System.out.println("the student is eligible for both : ");
			}
			else {
				System.out.println("not eligible");
			}
		}
		
	}

}
