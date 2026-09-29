package com.java;

public class Hello {
    static void hello() {
    	System.out.println("run");
    }
    
    static void hello2() {
    	hello();
    	System.out.println("run2");
    }
    
    static void hello3() {
    	System.out.println("run3");
    	hello2();
    }
    
    static void hello4() {
    	hello3();
    	System.out.println("run4");
    }

	public static void main(String[] args) {
		System.out.println("started");
		hello4();
		System.out.println("end");
	

	}

}
