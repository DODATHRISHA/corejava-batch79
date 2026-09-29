package com.java;

public class Employee1 {
	
//	static variable
		static int count =0;
		
//		constructor
		Employee1(){
			count++;
		}

	public static void main(String[] args) {
		
		// object creation1
		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1();
		Employee1 e3 = new Employee1();
		Employee1 e4 = new Employee1();
		
		System.out.println("the number of object creation:"+count);
		

	}

}
