package com.sparta.nam.basics;

public class Loops {
    public static void main(String[] args) {

        // Array when inititalised has to be initialised with values or if o values, the length it's going to be
        // IMMUTABLE!

        // datatype followed by []

        // Declaring variable example which as an array which can only take soubles
        // Initialising the array WITH VALUES
        // Initialised with 3 values, the max size it can be is 3 - we can't add a 4th element
        double[] example = new double[]{20.0, 1.0, 20.0};
        double indexOne = example[0];
        double thirdElement = example[2];

        // NOT initlaised with values
        double[] weights = new double[4];
        weights[0] = 3.5;
        weights[1] = 4.2;
        weights[2] = 7.1;
        weights[3] = 1.3;
        weights[3] =  weights[3] + 1;
//        System.out.println(weights[0]);
//        System.out.println(weights[1]);
//        System.out.println(weights[2]);
//        // System.out.println(weights[4]); // Exception thrown
//
//
//        // Enhanced for loop - ONLY used for read only operations
//        for(double d : weights){
//            System.out.println(d);
//        }

        // weights.length = 4

//        System.out.println(weights.length);
//
//        // for loop - read AND write
//        for(int i = 0; i < weights.length; i++){
//            weights[i] = weights[i] + 1;
//            System.out.println(weights[i]);
//        }
//
//        // while loop will only excute if its condition is true ()
//        int j = 0;
//        while(j < weights.length){
//            System.out.println(weights[j]);
//            j++;
//        }

        int k = 0;
        do{
            System.out.println(weights[k]);
            k++;
        }while(k < weights.length);


    }
}
