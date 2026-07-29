package com.constructor;

public class Cricketplayer {
	
	String cname;
	int team;
	int runs;
	
	Cricketplayer(){
		System.out.println("*****no args constructor*********");
		cname="kohil";
		team=9;
		runs=10;
	}
	Cricketplayer(String cname,int team,int runs){
		System.out.println("*********parameterized constructor********");
		this.cname=cname;
		this.team=team;
		this.runs=runs;
	}
	
	void display() {
		System.out.println("enter cricketer name : " + cname);
		System.out.println("enter team no : " + team);
		System.out.println("enter no of runs  : " + runs);
	}
	

	public static void main(String[] args) {
		Cricketplayer c = new Cricketplayer();
		c.display();
		Cricketplayer c1 = new Cricketplayer("hema",9,34);
		c1.display();

	}

}
