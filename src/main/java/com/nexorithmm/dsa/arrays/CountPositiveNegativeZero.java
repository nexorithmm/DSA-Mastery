package com.nexorithmm.dsa.arrays;

import java.util.Arrays;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {

        /*

        📌 Problem

        Count Positive, Negative & Zero Elements

📝 Problem Statement

        Given an integer array, count:

        Positive numbers
        Negative numbers
        Zero values

        Print the total count of each.

        Example
        Input:
    [10, -5, 0, 25, -8, 0, 15, -2]

        Output:
        Positive Count : 3
        Negative Count : 3
        Zero Count     : 2

         */


        int[] array = {10, -5, 0, 25, -8, 0, 15, -2};
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int number : array){

            if(number > 0){
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }else{
                zeroCount++;
            }

        }

        System.out.println("======================================");
        System.out.println("          Count Positive, Negative & Zero");
        System.out.println("======================================");

        System.out.println();
        System.out.println("Array :  "+ Arrays.toString(array));
        System.out.println();

        System.out.println("Positive Count  : " + positiveCount);
        System.out.println("Negative Count : " + negativeCount);
        System.out.println("Zero Count        : " + zeroCount);

    }
}
