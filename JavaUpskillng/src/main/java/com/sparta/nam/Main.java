package com.sparta.nam;

public class Main {

    public static void main(String[] args) {
       int timeOfDay = 21;
       String result = greeting(timeOfDay);
        System.out.println(result);

        int sum = add(3,4);
        System.out.println(sum);

        String hello = sayHello("Nish");
        System.out.println("Hello");
    }

    public static Integer add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static String sayHello(String name){
        return "Hello " + name;
    }
    public static String greeting(int timeOfDay) {
        if(timeOfDay >= 5 && timeOfDay <12 ){
            return "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <=18){
            return "Good afternoon";
        } else {
           return "Good evening!";
        }
    }
}