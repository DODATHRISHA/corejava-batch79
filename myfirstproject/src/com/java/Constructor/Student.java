
package com.java.Constructor;

public class Student {
    int rollnum;
    String name;
    int age;

    // No-arg constructor
    Student() {
        System.out.println("no-arg constructor calling");
        rollnum = 10;
        name = "trisha";
    }

    public static void main(String[] args) {
        System.out.println("main method started");

     // Object created With the help of default constructor
        // Object created with the help of  no-arg constructor
        Student s1 = new Student();
        System.out.println("********************");
        s1.studentInfo();
        System.out.println("rollnum:" + s1.rollnum);
        System.out.println("name:" + s1.name);
        System.out.println("age:" + s1.age);
        
        Student s2 = new Student();
        s2.studentInfo();
        System.out.println("********************");
        System.out.println("rollnum:" +  s2.rollnum);
        System.out.println("name:" +  s2.name);
        System.out.println("age:" +  s2.age);
        
        Student s3 = new Student();
        s3.studentInfo();
        System.out.println("********************");
        System.out.println("rollnum:" +  s3.rollnum);
        System.out.println("name:" +  s3.name);
        System.out.println("age:" +  s3.age);

        System.out.println("main method ended");
    }
    
    void studentInfo() {
    	 System.out.println("********************");
    	System.out.println("rollnum:"+rollnum);
    	System.out.println("name:"+name);
    }
}

