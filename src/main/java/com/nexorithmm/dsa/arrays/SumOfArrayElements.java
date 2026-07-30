package com.nexorithmm.dsa.arrays;

public class SumOfArrayElements {
    public static void main(String[] args) {

        /*

        🎯 Problem Statement

        Given an integer array, find the sum of all its elements.

        Example

        Input:

    [10, 20, 30, 40, 50]

        Output:

        150

         */


        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        System.out.println("Sum of array elements : "+sum);

    }
}
