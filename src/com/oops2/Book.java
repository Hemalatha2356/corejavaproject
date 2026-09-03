package com.oops2;

public class Book {
	
	String title;
	Author author;
	
	//original constructor
	
	Book(String title,Author author){
		this.author=author;
		this.title=title;
	}
	
	//copied constructor
	
	Book(Book b2){
		this.title=b2.title;
		
		//copied object
		this.author=new Author(b2.author.name);
		
		
	}
	public static void main(String[] args) {
		Author a1= new Author("Hema");
		Book b1 = new Book("Hema",a1);
		
		Book b2 = new Book(b1);
		//original object
		b1.author.name="kavya";
		System.out.println("original " + b1.author.name);
		System.out.println("copied " + b2.author.name);
		
	
	}

}
