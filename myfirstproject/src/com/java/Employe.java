package com.java;

public class Employe {
//	instance variable
	int employeid;
	String empoloyename;
	int salary;
	int experience;
	boolean isperminent;

	public static void main(String[] args) {
		
//		creating object
		Employe e = new Employe();
		e.employeid=101;
		e.empoloyename= "trisha";
		e.salary = 50000;
		e.experience = 2;
		e.isperminent = true;
		
		System.out.println("empoloyeid:"+e.employeid);
		System.out.println("empoloyename:"+e.empoloyename);
		System.out.println("empoloyesalary:"+e.salary);
		System.out.println("experience:"+e.experience);
		System.out.println("isperminent:"+e.isperminent);

	}

}
