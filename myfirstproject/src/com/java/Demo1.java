package com.java;

public class Demo1 {

    // 3 static methods
    static void method1() {
        System.out.println("Static Method 1");
    }

    static void method2() {
        System.out.println("Static Method 2");
    }

    static void method3() {
        System.out.println("Static Method 3");
    }

    // 2 instance methods
    void method4() {
        System.out.println("Instance Method 1");
    }

    void method5() {
        System.out.println("Instance Method 2");
    }

    // Static block
    static {
        method1();
        method2();
        method3();
    }

    // Instance block
    {
        method4();
        method5();
    }

    public static void main(String[] args) {

       new Demo1();
        

    }
}
	
	






