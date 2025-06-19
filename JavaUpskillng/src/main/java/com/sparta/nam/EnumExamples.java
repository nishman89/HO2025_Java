package com.sparta.nam;

public class EnumExamples {
    public enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        int addResult = add(3,3);
        String result = getGreeting(Day.FRIDAY);
        System.out.println(result);
    }

    public static int add(int a, int b){
        return a + b;
    }
    public static String getGreeting(Day day){
        String greeting = "";

        switch(day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                greeting = "Have a lovely day at work!";
                break;
            case FRIDAY:
                greeting = "Nearly the weekend!";
                break;
            case SATURDAY:
            case SUNDAY:
                greeting = "Relax and enjoy!";
                break;
        }
        return greeting;
    }
}
