package com.java;

public class Demo10 {
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is destroyed by Garbage Collector");
	}

	public static void main(String[] args) {
		
		
//		reference set to null
		Demo10 d1 = new Demo10();
		d1=null;
		
//		reference reassined
		Demo10 d2 = new Demo10();
		Demo10 d3 = new Demo10();
		d2=d3;
		 createObject();
		 
//		object creating inside a method
		
		
//		 anonymous object
		new Student();
		
//		request jvm collect the garbage colection
		System .gc();
		  }
	static void createObject() {
		Student s4 = new Student();
		

	}

}
