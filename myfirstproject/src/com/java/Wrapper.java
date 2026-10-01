package com.java;

public class Wrapper {
	
	 int studentid = 101;
	 double marks = 86.01;
	 boolean passstatus = true;
	 
//	  Autoboxing to convert primitive to wrapper
	 Integer a1 = 100; 
	 
//	  Autoboxing to convert  wrapper to primitive
	 int a2 = a1;
	
	public static void main(String[] args) {
		Wrapper w = new Wrapper();

		
		System.out.println("Student:"+ w.studentid);
		System.out.println("Marks:"+w.marks);
		System.out.println("PassStatus:"+w.passstatus);
		
		System.out.println("a1:"+w. a1);
		System.out.println("a2:"+w.a2);

	}

}
