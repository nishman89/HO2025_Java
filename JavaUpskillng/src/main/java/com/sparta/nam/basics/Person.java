package com.sparta.nam.basics;

public class Person {

    public static String name = "Nish Mandal";
    public static String code = "1989";
    public static void main(String[] args) {

        String codeAndName = code + " " + name;
        System.out.println(getName());
    }

    public static String getName(){

        return code + " " + name;
    }
}

