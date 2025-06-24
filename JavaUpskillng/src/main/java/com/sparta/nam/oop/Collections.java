package com.sparta.nam.oop;

import java.util.ArrayList;
import java.util.List;

public class Collections {
        public static void main(String[] args) {
            System.out.println(longWordList("Hello my name is Nishant"));
        }
        public static List<String> longWordList(String phrase) {
            List<String> result = new ArrayList<>();
            String[] myArr = phrase.split(" ");
            for (String word : myArr) {
                if (word.length() >= 5) {
                    result.add(word);
                }
            }
            return result;
        }
}
