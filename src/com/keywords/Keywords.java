package com.keywords;

public class Keywords {
	
	int a;
	float b;
	double c;
	{
		System.out.println("executate the instance block.....");
		a=10;
		b=4.5f;
		c=22.44;
	}
	void add() {
		double  result  = a+b+c;
		System.out.println("integer " + a);
		System.out.println("float " + b);
		System.out.println("double " + c);
		System.out.println("Additionalrsult " + result);

	}

	public static void main(String[] args) {
		Keywords obj=new Keywords();
		obj.add();

	}

}
