package com.sparta.nam.memorymodeldemo;

public class MemoryModel {
    public static void main(String[] args) {

        // walkthrough part 1
//        int dev = 5;
//        int bav = dev;
//        bav++;
//        String abdullah = "Abdullah";
//
//        var supriya = abdullah.toUpperCase();
//        int[] hiren = {2, 7, 8, 1};
//        dev = hiren[2];

//
//        var nish = hiren;
//        nish[2] = 10;

        // this is the end of the method  Unwind the stack - ask everyone to sit down one by one starting at the top of the stack
        // at this point run the garbage collector: (it normally runs when the heap is getting full)
        // 1. Identify the objects on the heap that are not reachable from the stack
        // 2. set the references to them to null (detach the from the strings)
        // 3. compact the heap - move the remaining objects on the heap together


        // Part 2 - comment out part 1 and uncomment this section

             var dev = new Person("Dev", "Limbachya");
             dev.setFirstName("Dav");
             var hiren = 3.6;
             String supriya = "Supriya";
             int result = processPerson(dev, hiren);
            System.out.println(dev.getFirstName());

            for(int i = 0; i <= 5; i++){
                System.out.println(i);
            }
         }

        public static int processPerson (Person bav, double dunstan){
            var abdullah = "Abdullah";
            bav.setFirstName("Bob");
            dunstan *= 2;
            return (int) dunstan;
        }

}