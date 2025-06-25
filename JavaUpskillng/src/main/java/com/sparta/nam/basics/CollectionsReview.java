package com.sparta.nam.basics;

import com.sparta.nam.oop.BaseballMember;
import com.sparta.nam.oop.Member;
import io.cucumber.java.sl.In;

import java.util.*;

public class CollectionsReview {
    public static void main(String[] args) {
        // Declare an array list of strings
        ArrayList<String> myList1 = new ArrayList<>();
        List<String> myList2 = new ArrayList<>(List.of("Abdullah", "Bav", "Supriya"));
        var myList3 = new ArrayList<String>();

        myList1.add("Abdullah"); // Index: 0
        myList1.add("Hiren"); // Index: 1
        myList1.add("Dunstan"); // Index: 2
        myList1.add("Dunstan"); // Index: 3

        System.out.println(myList1.get(2));
        System.out.println(myList1);

        HashSet<String> mySet = new HashSet<>();
        mySet.add("Dev");
        mySet.add("Dunstan");
        mySet.add("Nish");
        mySet.add("Nish");
        System.out.println(mySet);


        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(55, "John");
        myMap.put(56, "Harry");
        myMap.put(57, "Zayn");

        System.out.println(myMap.get(56));





    }
}
