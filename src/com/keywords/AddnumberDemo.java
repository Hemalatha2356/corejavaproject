package com.keywords;

public class AddnumberDemo {
	int num1;
	float num2;
	double num3;
	{
		System.out.println("instance Block Executing...");
		num1=10;
		num2=20.4f;
		num3=30.75;
	}
	void addnumber() {
		double result = num1+num2+num3;
		System.out.println("Integer value : " +num1);
		System.out.println("float value : " +num2);
		System.out.println("Double value : "+num3);
		System.out.println("Additional Result = "+result);
	}
	
	public static void main(String[] args) {
		
		AddnumberDemo obj = new AddnumberDemo();
		obj.addnumber();
	}
	
}
