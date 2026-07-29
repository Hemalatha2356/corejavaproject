package com.constructor;

public class Book1 {
	int bookid;
	String title;
	String author;
	Book1(){
		
		System.out.println("default consrtructor called : ");
	}
	
	Book1(int bookid,String title,String author){
		System.out.println("parameterized constructor called : ");
		
		this.bookid=bookid;
		this.title=title;
		this.author=author;
	}
	Book1(Book1 b){
		System.out.println("copy constructor : ");
		this.bookid=b.bookid;
		this.title=b.title;
		this.author=b.author;
		
	}
	
	void display() {
		System.out.println("Bookid : " + bookid);
		System.out.println("title : " + title);
		System.out.println("author : " + author);
	}

	public static void main(String[] args) {
		System.out.println("main method started : ");
		
		Book1 b3 = new Book1();
		b3.display();
		Book1 b = new Book1(101,"java programming","srikanth");
		b.display();
		System.out.println("first book");
		Book1 b1 = new Book1(b);
		b1.display();
		System.out.println("copy book");
		
		

	}

}
