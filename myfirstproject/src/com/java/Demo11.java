package com.java;

public class Demo11 {
	
	@Override
	protected void finalize() throws Throwable {
	   System.out.println("selected for garbage collection");
	}

	public static void main(String[] args) {
		
		Demo11 d1 = new Demo11();
		Demo11 d2 = new Demo11();
		d1=d2;
		d1=null;
		d2=null;
		
		
		

		
		createObject();	
		
//		anonymous object
		new Demo11();
		
//		selected for gc
		 System.gc();
		
	}
	static void createObject(){
		Demo11 d2 = new Demo11();
	}

}
