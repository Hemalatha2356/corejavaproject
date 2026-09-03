package com.oops1.inheritancetypes;


class Course{
	void duration() {
		System.out.println("the Course duration!!");
	}
}

class javaCourse extends Course{
	@Override
	void duration() {
		System.out.println("javacourse duration is 3months!!");
	}
}

class pythonCourse extends Course{
	
	void duration() {
		System.out.println("pythoncourse duration is 2months!!");
	}
}

class SQLCourse extends Course{
	void duration() {
		System.out.println("SQLCourse duration is 1month!!");
	}
}


public class TestDemo3 {
	
	public static void main(String[] args) {
		Course c = new Course();
		Course c1 = new javaCourse();
		Course c2 = new pythonCourse();
		Course c3 = new SQLCourse();
		c.duration();
		c1.duration();
		c2.duration();
		c3.duration();
		
		

	}

}
