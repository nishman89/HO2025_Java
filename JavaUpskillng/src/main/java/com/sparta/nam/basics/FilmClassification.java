package com.sparta.nam.basics;


public class FilmClassification {
    public static String getClassificationsByAge(int ageOfViewer) {
        String result;
        if (ageOfViewer < 12) {
            result = "U & PG films are available.";
        } else if (ageOfViewer < 15) {
            result = "U, PG & 12 films are available.";
        } else if (ageOfViewer < 18) {
            result = "U, PG, 12 & 15 films are available.";
        } else {
            result = "All films are available.";
        }
        return result;
    }
}

