package com.sparta.nam;

public class Selection {
    public static void main(String[] args) {
//        System.out.println(getGradeIfElse(40));
//        System.out.println(getGradeConditionalOperator(60));

        var message = priority(2);
        System.out.println(message);
    }

    public static String priority(int level){

        String priority = "Code ";
        switch (level){
            case 3:
                priority = priority + "Red";
                break;
            case 2:
            case 1:
                priority = priority + "Amber";
                break;
            default:
                priority = "Error";
                break;
        }
        return priority;
    }

    public static String getGradeIfElse(int mark){

        if(mark >= 85){
            return "Distinction";
        }  if (mark >= 65){
            return "Pass";
        }  {
            return "Fail";
        }
    }

    // Conditional operator
    public static String getGradeConditionalOperator(int mark){
        String grade = mark >= 65 ? "Pass" : "Fail";
        return grade;
    }
}
