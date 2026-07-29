package com.constructor;

public class HospitalPatient {
	int patientid;
	String patitentname;
	String disease;
	double bill;
	
	HospitalPatient(int patientid,String patitentname,String disease,double bill){
		System.out.println("parameterized constructor called : ");
		this.patientid=patientid;
		this.patitentname=patitentname;
		this.disease=disease;
		this.bill=bill;
	}
	HospitalPatient(HospitalPatient h){
		System.out.println("copy constructor called : ");
		this.patientid=h.patientid;
		this.patitentname=h.patitentname;
		this.disease=h.disease;
		this.bill=h.bill;
	}
	void info() {
		System.out.println("patientid : " + patientid);
		System.out.println("patitentname : " + patitentname);
		System.out.println("disease : " + disease);
		System.out.println("bill " + bill);
	}
	public static void main(String[] args) {
		HospitalPatient h = new 	HospitalPatient(101,"kjkhtyu","feever",10000);
		h.info();
		HospitalPatient h1 = new HospitalPatient(h);
		
		h1.bill+=3000;
		
		h1.info();
		
		

	}

}
