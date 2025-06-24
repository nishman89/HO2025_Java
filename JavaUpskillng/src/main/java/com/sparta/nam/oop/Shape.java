package com.sparta.nam.oop;

public abstract class Shape {
    public abstract int calculateArea();
    @Override
    public String toString() {
        return getClass().getName() + " Area: " + calculateArea();
    }

    public int calculate(int a, int b){
        return a + b;
    }

}


