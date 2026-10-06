package com.java;

public class LiteralsDemo3 {
	
	static char a = '7';
	static char a1 = '\u0000';
	static char a2 = '\uafba';
	
	 String s = "trisha";
	 String s1 = "bunny";
	
	static boolean b = true;
//	by default it consider the false
	static boolean b1; 
	
	static String n = "trisha";
	static Integer num = 1;
	
	
	
	public static void main(String[] args) {
		
		LiteralsDemo3 l = new LiteralsDemo3();
		
		n = null;
		num = null;
		
		
		System.out.println(LiteralsDemo3.a);
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		
		System.out.println(l.s);
		System.out.println(l.s1);
		
		System.out.println("b:"+b);
		System.out.println("b1:"+b1);
		
		System.out.println("n:"+n);
		System.out.println("num:"+num);
		
		
		

	}

}
