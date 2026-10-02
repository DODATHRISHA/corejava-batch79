package com.java;

public class Studentinfo {
	
	String stdname = "trisha";
	int stdid = 101;
	String course = "Java full stack";
	
	int marks1;
	int marks2;
	int marks3;
	
	int total;
	double avg;
	
//	student details display
	void studentdetails(){
		System.out.println("Student Name:"+stdname);
		System.out.println("Student id:"+stdid);
		System.out.println("Student course:"+course);
	}
	
//	method calculation
	void studentcalculation() {
		total = marks1 + marks2 + marks3;
		System.out.println("Total Marks:"+total);
	}
	
//	method average
	void studentaverage() {
		avg = total/ 3;
		System.out.println("Student average:"+avg);
	}
	
	
	public static void main(String[] args) {
		Studentinfo s = new Studentinfo();
		
		s.marks1=50;
		s.marks2 = 60;
		s.marks3 = 70;
		
//		 callmethos
		s.studentdetails();
		s.studentcalculation();
	}

}
