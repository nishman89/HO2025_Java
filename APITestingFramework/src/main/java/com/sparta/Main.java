package com.sparta;

public class Main {
    public static void main(String[] args) {

        //Pattern matching
        String input = "Supriya,Hiren,Bav,Dunstan,       Abdullah";
        String[] names = input.split("[a-zA-Z]+ *[a-zA-Z]+"); //Nishant       Mandal, Dunstan King
        for(String name : names){
            System.out.println(name);
        }


    }
}