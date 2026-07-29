package person.constructors;

public class Person {
	String name;
	int age;
	
	
	Person(){
		this("unknow",0);
		System.out.println("default constructor called  : ");
	}

	Person(String name,int age) {
		
		System.out.println("person parameterized constructor called : ");
		
		this.name=name;
		this.age=age;
		
		
	}


}
