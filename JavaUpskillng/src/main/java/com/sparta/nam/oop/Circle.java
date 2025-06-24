package com.sparta.nam.oop;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public int calculateArea() {
        return (int)(radius * radius * Math.PI);
    }
}
