package com.constructor;

public class LibraryBook {
	
	int bookid;
	String title;
	String author;
	int avaliablecopies;
	
	LibraryBook(int bookid,String title,String author,int avaliablecopies){
		System.out.println("parameterized constructor : ");
		this.bookid=bookid;
		this.title=title;
		this.author=author;
		this.avaliablecopies=avaliablecopies;
		
	}
	
	LibraryBook(LibraryBook l){
		this.bookid=l.bookid;
		this.title=l.title;
		this.author=l.author;
		this.avaliablecopies=l.avaliablecopies;
		
	}
	void info() {
		System.out.println("bookid : " + bookid);
		System.out.println("title : " + title);
		System.out.println("author : " + author);
		
		System.out.println("avaliablecopies : " + avaliablecopies);
	}
	

	public static void main(String[] args) {
		LibraryBook l = new LibraryBook(101,"way to talk","hema",20);
		l.info();
		LibraryBook l1 = new LibraryBook(l);
		System.out.println("avaliablecopies ");
		l1.avaliablecopies--;
		l1.info();
		
		
	}

}
