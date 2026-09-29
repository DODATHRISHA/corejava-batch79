package com.java;

public class Employee {
//	static variable
	static String companyName = "TCS";
	
//	instance variable
	int empid;
	String empname;
	int salary;
	
//	static block
	static {
		System.out.println("company name:"+companyName);
	}
	
//	instance block
	{
		System.out.println("Employee object created");
	}
	
//	instance method
	void employedetail() {
		System.out.println("Empid:"+ empid);
		System.out.println("Empname:"+empname);
		System.out.println("Salary:"+salary);
	}
	
//	static method
	static void employeecompany() {
		System.out.println("company name:"+companyName);
	}


	
 public static void main (String[]args) {
	 Employee e = new Employee();
	 Employee e1 = new Employee();
	 
	 e.empid = 1;
	 e.empname = "trisha";
	 e.salary = 20000;
	 
	 e1.empid = 2;
	 e1.empname = "bunny";
	 e1.salary = 30000;
	 
	 e.employedetail();
	 e1.employedetail();
	 
	 Employee.employeecompany();
	}

}
