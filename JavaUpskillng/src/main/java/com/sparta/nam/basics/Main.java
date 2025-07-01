package com.sparta.nam.basics;

public class Main {

    public static void main(String[] args) {
       int timeOfDay = 22;
       try {
           String result = greeting(timeOfDay);
           System.out.println(result);
       }catch(IllegalArgumentException e){
           System.out.println("Caught exception: " + e);
           System.out.println("Message: " + e.getMessage());
       }finally {
           System.out.println("I am always run!");
       }

    }

    public static Integer add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static String sayHello(String name){
        return "Hello " + name;
    }
    public static String greeting(int timeOfDay) {
        if(timeOfDay < 0 || timeOfDay > 23){
            throw new IllegalArgumentException("Must be 0-23");
        }

        if(timeOfDay >= 5 && timeOfDay <12 ){
            return "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <=18){
            return "Good afternoon";
        } else {
           return "Good evening!";
        }
    }
}