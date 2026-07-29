package com.constructor;

public class Movie {
	String name;
	String hero;
	String heroin;
	String director;
	String producer;
	double budget;
	int year;
	
	Movie(){
		this("vera");
		System.out.println("no arg constuctor called ");
	}
	Movie(String name){
		this("vera","gopichandu");
		System.out.println("one arg constructor called ");
	}
	Movie(String name,String hero){
		this("vera","gopichandu","preethi");
		System.out.println("two arg constuctor called ");
	}
	Movie(String name,String hero,String heroin){
		this("vera","gopichandu","preethi","rajmoli");
		System.out.println("three arg constuctor called ");
	}
	Movie(String name,String hero,String heroin,String director){
		this("vera","gopichandu","preethi","rajmoli","niha");
		System.out.println("four arg constuctor called ");
	}
	
	Movie(String name,String hero,String heroin,String director,String producer){
		this("vera","gopichandu","preethi","rajmoli","niha",987656789);
		System.out.println("fivth arg constuctor called ");
	}
	Movie(String name,String hero,String heroin,String director,String producer,double budget){
		this("vera","gopichandu","preethi","rajmoli","niha",987656789,2023);
		System.out.println("six arg constuctor called ");
	}
	Movie(String name,String hero,String heroin,String director,String producer,double budget,int year){
		
		
		this.name=name;
		this.hero=hero;
		this.heroin=heroin;
		this.director=director;
		this.producer=producer;
		this.budget=budget;
		this.year=year;
		System.out.println("seven arg constuctor called ");
	}
	
	void movieinfo() {
		System.out.println("*********************************************");
		System.out.println("Movie name : " + name);
		System.out.println("Movie hero : " + hero);
		System.out.println("Movie heroin : " + heroin);
		System.out.println("Movie director : " + director);
		System.out.println("Movie producer : " + producer);
		System.out.println("Movie budget : " + budget);
		System.out.println("Movie year : " + year);
		System.out.println("*********************************************");
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method started ");
		Movie m = new Movie();
		m.movieinfo();
		Movie m1 = new Movie("vera");
		m1.movieinfo();
		Movie m2 = new Movie("vera","gopichandu");
		m2.movieinfo();
		Movie m3 = new Movie("vera","gopichandu","preethi");
		m3.movieinfo();
		Movie m4 = new Movie("vera","gopichandu","preethi","rajmoli");
		m4.movieinfo();
		Movie m5 = new Movie("vera","gopichandu","preethi","rajmoli","niha");
		m5.movieinfo();
		Movie m6 = new Movie("vera","gopichandu","preethi","rajmoli","niha",987656789);
		m6.movieinfo();
		Movie m7 = new Movie("vera","gopichandu","preethi","rajmoli","niha",987656789,2023);
		m7.movieinfo();
		
		System.out.println("main method ended ");
		
		
	

	}

}
