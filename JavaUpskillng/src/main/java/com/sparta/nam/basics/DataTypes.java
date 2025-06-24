package com.sparta.nam.basics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataTypes {
    public static void main(String[] args) {
//        int num = 3;
//        // num = "Nish"; // Wont work as we must explicitly state the data type of our variable
//
//        int anInt = 3; //  explicty typed
//        var vInt = 6; //Implicitly typed
//
//        int bInt;
//        bInt = 4;
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//
//        System.out.println(Double.MAX_VALUE);
//
//        int myInt = 3;
//        // Wrapper class - wrap my primitive type in a class so I can do more stuff with it
//        Integer myint2 = 3;
//        double myDouble = 3.3;
//        Double mydouble2 = 3.5;

        // Dates & Stuff

        var today = LocalDate.now();
        System.out.println(today);
        var fiveMonthsLater = today.plusMonths(5);
        System.out.println(fiveMonthsLater);

        // How old is Nish in code!
        LocalDate nishBday = LocalDate.of(1989,11,2);
        System.out.println(nishBday);
        // Using the above code, use somemethods to findout how old I am
    }
}
