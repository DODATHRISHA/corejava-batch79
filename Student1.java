package com.java;

public class Student1 {
//	instance variable
	int rollnumber;
	String name;
	int age;
	int percentage;
	char grade;
	boolean result;
	
	void display() {
		System.out.println(rollnumber);
		System.out.println(name);
		System.out.println(age);
		System.out.println(percentage);
		System.out.println(grade);
		System.out.println(result);
	}

	public static void main(String[] args) {
		Student1 s = new Student1();
		Student1 s2 = new Student1();
		s.rollnumber = 101;
		s.name = "trisha";
		s.age = 21;
		s.percentage = 30;
		s.grade ='F';
		s.result = false;
		
		s2.rollnumber = 102;
		s2.name = "bunny";
		s2.age = 21;
		s2.percentage = 80;
		s2.grade ='A';
		s2.result = true;
		
		s.display();
		s2.display();
		

	}

}
