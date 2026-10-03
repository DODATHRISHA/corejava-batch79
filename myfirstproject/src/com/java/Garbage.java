package com.java;

public class Garbage {

    int id;
    String name;

    void studentdetails() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
    }

    @Override
    protected void finalize() {
        System.out.println("Object is going to be garbage collected");
    }

    public static void main(String[] args) {

        Garbage c1 = new Garbage();
        Garbage c2 = new Garbage();

        c1.id = 1;
        c1.name = "abc";

        c2.id = 2;
        c2.name = "xyz";

        c1.studentdetails();
        c2.studentdetails();

        // Making Object 1 eligible for Garbage Collection
        c1 = null;

        // Requesting Garbage Collector
        System.gc();

    }
}