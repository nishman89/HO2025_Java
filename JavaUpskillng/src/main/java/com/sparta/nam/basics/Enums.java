package com.sparta.nam.basics;

import java.time.DayOfWeek;


public class Enums {

    // Asside - these are constants *static and final) - we can't change their value!
//    public static final int MONDAY = 0;
//    public static final int TUESDAY = 1;
//    public static final int WEDNESDAY = 2;
//    public static final int THURSDAY = 3;
//    public static final int FRIDAY = 4;
//    public static final int SATURDAY = 5;
//    public static final int SUNDAY = 6;



    public static void main(String[] args) {


        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

        Day dayOfTheWeek = Day.SUNDAY;

        if (dayOfTheWeek == Day.SATURDAY || dayOfTheWeek == Day.SUNDAY) {
            System.out.println("It's the weekend");
        } else {
            System.out.println("It's a weekday");
        }
    }
}
