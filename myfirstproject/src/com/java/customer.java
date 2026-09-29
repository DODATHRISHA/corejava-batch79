package com.java;

public class customer {
	
//	static variable to count objects
	 static int count = 0;
	 
//	 constructor
	 customer(){
		 count++;
	 }

	public static void main(String[] args) {
//		 creating multiple objects
		customer C1 = new customer();
		customer C2 = new customer();
		customer C3 = new customer();
		customer C4 = new customer();
		
//		display the object count
		System.out.println("total number of object creating:"+count);

	}

}
