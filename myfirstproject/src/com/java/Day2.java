package com.java;

class Day2 {
	
//	instance variable
	String name;
	int age;
	int experience;
	String course;
	
	public static void main(String[] args) {
		
//		object creation
		 Day2 d1 = new  Day2();
		 d1.name ="trisha";
		 d1.age=21;
		 d1.experience = 2;
		 d1.course="java";
		 
		System.out.println("name:"+d1.name);
		System.out.println("age:"+d1.age);
		System.out.println("experience:"+d1.experience);
		System.out.println("course:"+d1.course);

	}

}
package com.java;

public class Student {

    // Static variable
    static String collegeName = "CMR";

    // Instance variables
    int rollNo;
    String name;
    int marks;

    // Static block
    static {
        System.out.println("College Name: " + collegeName);
    }

    // Instance block
    {
        System.out.println("Student object created");
    }

    // Instance method
    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Static method
    static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {

        // First student
        Student s = new Student();
        s.rollNo = 1;
        s.name = "Trisha";
        s.marks = 30;

        // Second student
        Student s1 = new Student();
        s1.rollNo = 2;
        s1.name = "Bunny";
        s1.marks = 40;

        // Calling instance method
        s.displayStudent();
        s1.displayStudent();

        // Calling static method
        Student.displayCollege();
    }
}
