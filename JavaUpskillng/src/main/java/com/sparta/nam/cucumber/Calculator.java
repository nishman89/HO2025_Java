package com.sparta.nam.cucumber;

public class Calculator {

    private int num1;
    private int num2;
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 =  num2;
    }

    public int add() {
        return num1 + num2;
    }

    public Integer subract() {
        return num1 - num2;
    }
}
