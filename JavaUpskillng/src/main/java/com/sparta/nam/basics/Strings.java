package com.sparta.nam.basics;

public class Strings {
    public static void main(String[] args) {
        // Strings are IMMUTABLE!!
        String name = " Nish ";
        System.out.println(name);
        char c = name.charAt(1);
        System.out.println(name.toLowerCase());
        String newName = name.trim();
        System.out.println(newName);

//        String result = stringExercise(" Java list fundamentals ");
//        System.out.println(result);

        String nishName = "Nishant";
        String nishNameSubString = nishName.substring(0,4);
        System.out.println(nishNameSubString);

    }

    public static String stringExercise(String myString){
        var trimmedString = myString.trim();
        var ucString = trimmedString.toUpperCase();
        var replacedString = ucString.replace('L', '*');
        var replacedString2 = replacedString.replace('T', '*');
        var nPos = replacedString2.indexOf('N');
        var finalString = replacedString2.substring(0, nPos + 1);
        return finalString;
    }


}
