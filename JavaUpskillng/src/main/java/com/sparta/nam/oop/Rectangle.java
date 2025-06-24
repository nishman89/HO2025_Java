package com.sparta.nam.oop;

public class Rectangle extends Shape{

    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    // Create a circle class which extends shape
    // Pi r 2 is area
    // Ciricle just needs one field - radius
    @Override
    public int calculateArea() {
        return length * height;
    }

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
