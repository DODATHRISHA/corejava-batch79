package com.java;

public class Student2 {

    // Instance variables
    int rollnumber;
    String name;
    int marks;

    // Static variable
    static String college = "CMR";

    // Instance block
    {
        System.out.println("Student object created");
    }

    // Instance method
    void studentDetails() {
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Static block
    static {
        System.out.println("College: CMR");
    }

    // Static method
    static void collegeDetails() {
        System.out.println("College Name: " + college);
    }

    // Main method
    public static void main(String[] args) {

        // Create 2 Student objects
        Student2 s = new Student2();
        Student2 s1 = new Student2();

        // Give values to first student
        s.rollnumber = 101;
        s.name = "Thrisha";
        s.marks = 85;

        // Give values to second student
        s1.rollnumber = 102;
        s1.name = "Bunny";
        s1.marks = 90;

        // Call instance method
        s.studentDetails();
        s1.studentDetails();

        // Call static method
        Student2.collegeDetails();
    }
}