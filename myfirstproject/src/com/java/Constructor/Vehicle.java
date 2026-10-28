
package com.java.Constructor;

class car {

    String brand;
    double price;

    // No-arg constructor
    car() {
        System.out.println("No-arg constructor");
        brand = "BMW";
    }

    // One-arg constructor
    car(String brand) {
        System.out.println("One-arg constructor");
        this.brand = brand;
    }

    // Two-arg constructor
    car(String brand, double price) {
        System.out.println("Two-arg constructor");
        this.brand = brand;
        this.price = price;
    }
}

public class Vehicle extends car {

    Vehicle() {
        super();
    }

    Vehicle(String brand) {
        super(brand);
    }

    Vehicle(String brand, double price) {
        super(brand, price);
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.carInfo();

        Vehicle v1 = new Vehicle("BMW");
        v1.carInfo();

        Vehicle v2 = new Vehicle("Audi", 2500000);
        v2.carInfo();
    }

    void carInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("***************");
    }
}


