package com.constructor;

public class Book {
	
	
	String title;
	String author;
	int price;
	
	Book(){
		System.out.println("no arg constructor : ");
		title = "way to learn";
		author = "narayana";
		price = 56789;
		
	}
	Book(String title1,String author1, int price1){
		System.out.println("********parameterized constructor*******");
		title=title1;
		author=author1;
		price=price1;
		
	}
	void diaplay() {
		System.out.println("enter a title : " + title);
		System.out.println("enter a author : "  + author);
		System.out.println("enter a price : " + price);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.diaplay();
		Book b1 = new Book("don't love any more","sriniva",56789);
		b1.diaplay();

	}

}
