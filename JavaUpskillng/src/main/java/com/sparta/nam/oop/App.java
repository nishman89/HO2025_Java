package com.sparta.nam.oop;

import com.sparta.nam.basics.Strings;

import java.util.*;

public class App {
    public static void main(String[] args) {

//        Member nish = new Member("Nish", "Mandal", 2025, 1,20);
//        Member noel = new Member("Noel", "Gallagher");
//
//        System.out.println(nish.getFullName());
//        nish.setLastName("Kumar");
//        System.out.println(nish.getMemberDays());
//        System.out.println(nish.getClass());
//        System.out.println(nish.hashCode());
//        System.out.println(nish.toString());
//
//
//        BaseballMember dev = new BaseballMember("Dev", "Limbachya", 2024,1,22, "shortstop");
//        System.out.println(dev.getFullName());
//        System.out.println(dev.getPosition());
//        System.out.println(dev.toString());
//
//
//        Member[] members = {dev, nish, noel};
//
//        Circle  circle = new Circle(5);
//        Shape rectangle = new Rectangle(5,10);
//        Shape[] shapes = {circle, rectangle};
//        for(Shape shape : shapes){
//            System.out.println(shape);
//        }
//
//
//        int a = 1;
//        int b = 1;
//        System.out.println(a == b);
//
//        var m1 = new Member("Nish", "Mandal"); // Mem location 1
//        var m2 = new Member("Nish", "Mandal"); // Memory location 2
//        var m3 = m1;
//
//        // By deafult - objects are compared based on their memory location
//        // We can override the base implementation of equals() so that it comapres firstName and LastName
//        // So that if they're the same, they are considered equal
//        System.out.println(m1.equals(m2));
//        System.out.println(m1.hashCode());
//        System.out.println(m2.hashCode());
//        System.out.println(m3.hashCode());

        // For two objects to be considered equal, .equals() must return true AND the hascodes msut be the same
        // Hascodes are used in some collections as a key

        String[] names = {"Hiren", "Dev", "Supriya", "Dunstan"};
        double[] weights = {-22.0,51.5};
        var paul = new Member("Paul","McCartney");
        var john = new Member("John", "Lennon");
        var ringo = new Member("Ringo", "Starr");
        var george = new Member("George", "Harrison");
        Member[] members = {john, paul, ringo, george};

//        for(Member m : members){
//            System.out.println(m.getFullName());
//        }
//
//        for(double d : weights){
//            System.out.println(d);
//        }
//
//        for(String s : names){
//            System.out.println(s);
//        }

        // ArrayList


        // List is an interface
        // ArrayList implements the List interface methods
        // I only have access to methods defined in the List interface when I declare it this way!
        List<Member> membersAL = new ArrayList<Member>();
        membersAL.add(paul);
        membersAL.add(john);
        membersAL.add(george);
        membersAL.add(ringo);

        ArrayList<Member> membersAl2 = new ArrayList<Member>(List.of(paul, john, george, ringo));

        System.out.println(membersAL.size());
        System.out.println(membersAL.get(0).getFullName());
        System.out.println(membersAL.contains(paul));


        for(Member m : membersAl2){
            System.out.println(m.getFullName());
        }

        Member example = new BaseballMember("Nish", "Mandal", 2020, 10,1, "Batter");

        var myList = Arrays.asList(members);

        // HashSets

        HashSet<String> membersHs = new HashSet<String>();
        membersHs.add("Nish");
        membersHs.add("Nash");
        membersHs.add("Nosh");
        membersHs.add("Nush");
        membersHs.add("Nush");
        System.out.println(membersHs);


        HashSet<Member> beatles = new HashSet<Member>();
        beatles.add(paul);
        beatles.add(john);
        beatles.add(ringo);
        beatles.add(george);
        beatles.add(new Member("Paul","McCartney"));

        for(Member m : beatles){
            System.out.println(m.getFullName());
        }

        // Hashmaps - ditionaries

        HashMap<String, Member> beatlesMap = new HashMap<String, Member>();
        beatlesMap.put("PAUL", paul);
        beatlesMap.put("JOHN", john);

        System.out.println(beatlesMap.get("PAUL").getFullName());

        // All keys
        var keys = beatlesMap.keySet();
        // All values
        var values = beatlesMap.values();
        // All keys AND values
        var kvPairs = beatlesMap.entrySet();

        System.out.println("Keys");
        for(String k : keys){
            System.out.println(k);
        }

        System.out.println("Values");
        for(Member v : values){
            System.out.println(v);
        }

        // Dictionaries - problem solving using HashMaps

        // Stacks and Queues - optional
    }

    public static int add(int a, int b){
        return a+ b;
    }

    public static int add(int a, int b, int c){
        return a+ b;
    }
}
