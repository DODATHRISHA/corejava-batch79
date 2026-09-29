package com.java;

public class mydetails {
	//instance variables
	String name;
	String city;
	int age;
	
	//static variable
	static String mydetails="personal";
	

	public static void main(String[] args) {
		
//		creating object
	mydetails D = new mydetails();
	 D.name = "trisha";
	 D.city = "hyderabd";
	 D.age = 21;
	 
//	 new object
	 Student s = new Student();
	 
	 s.name= "trisha";
		s.age = 21;
	 
//	 accessing values
	 
	 System.out.println("name:"+D.name);
	 System.out.println("city:"+ D.city );
	 System.out.println("age:"+ D.age);
		
	}

}

class mydetais{
	String name;
	String city;
	int age;
}
}
