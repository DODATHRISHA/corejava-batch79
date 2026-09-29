package com.java;

public class Student3 {

    byte age = 21;
    short numofstudent = 10000;
    int annualsalary = 400000;
    long population = 1234567891L;
    float percentage = 80F;
    double balance = 126.78;
    char grade = 'A';
    boolean Javalearner = true;

    public static void main(String[] args) {

        Student3 s = new Student3();

        System.out.println("Age: " + s.age);
        System.out.println("Total Student: " + s.numofstudent);
        System.out.println("Annual Salary: " + s.annualsalary);
        System.out.println("Population: " + s.population);
        System.out.println("Percentage: " + s.percentage);
        System.out.println("Balance: " + s.balance);
        System.out.println("Grade: " + s.grade);
        System.out.println("Java learner: " + s.Javalearner);
    }
}