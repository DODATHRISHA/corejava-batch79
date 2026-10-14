package com.java;

public class Student {

    static int count = 0;

    Student() {
        System.out.println("constructor called");
        count++;
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Total objects created: " + count);
    }
}

