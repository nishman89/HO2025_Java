package com.sparta;

public class Main {
    public static void main(String[] args) {

        try{
        //System.out.println(divide(2,0));

       System.out.println(grade(-4));
            // try our this code that mimght cause an error
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            // if an error, do something
        }finally {
            System.out.println("I am always going to be run in the ifnall block");
        }
    }

    public static String grade(int mark){

        if(mark < 0 ){
            throw new IllegalArgumentException("Can't have a number less than 0");
        }

        if(mark > 60){
            return "Pass";
        } else {
            return "fail";
        }
    }

    public static int divide(int num1, int num2){
        return num1/num2;
    }

}