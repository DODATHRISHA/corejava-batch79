package com.java;

public class StudentData {
	
	byte age = 21;
	short marks = 80;
	int rollnumber = 101;
	long phnnum = 1234567891;
	float percentage = 80F;
	double fee = 3000.03;
	char grade = 'A';
	boolean passed = true;

	public static void main(String[] args) {
		StudentData s = new StudentData();
		
		System.out.println("Age:"+s.age);
		System.out.println("Marks:"+s.marks);
		System.out.println("Roll number:"+s.rollnumber);
		System.out.println("phone number:"+s.phnnum);
		System.out.println("Percentage:"+s.percentage);
		System.out.println("Fee:"+s.fee);
		System.out.println("Grade:"+s.grade);
		System.out.println("Passed:"+s.passed);
	}

}
