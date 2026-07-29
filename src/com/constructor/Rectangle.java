package com.constructor;

public class Rectangle {
	
	double length;
	double breath;
	Rectangle(){
		System.out.println("*******no args constructor*****");
		length = 8;
		breath=9;
		
	}
	
	Rectangle(double length,double breath){
		this.length=length;
		this.breath= breath;
		
	}
	
	void display() {
		System.out.println("length : " + length);
		System.out.println("breath : " + breath);
		double area = length*breath;
		 double perimeter = 2*length*breath;
		System.out.println("area of rectangle  : " + area);
		System.out.println("perimeter of rectangle : " + perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Rectangle r = new Rectangle();
	 r.display();
	 Rectangle r1 = new Rectangle(10,48);
	 r1.display();

	}

}
