package com.nexorithmm.dsa.arrays;

public class AverageOfArrayElements {
    public static void main(String[] args) {

        /*

        📌 Problem Statement

        Given an integer array, find the average of all elements.

                Example
                Input
    [10, 20, 30, 40, 50]
        Output
        Average : 30.0

         */

        int[] array = {10, 20, 30, 40, 51};
        int n = array.length;
        int sum = 0;
        double averageOfArrayElements = 0;

        for(int value : array){
            sum += value;
        }

        averageOfArrayElements = (double) sum / n;

        System.out.printf("Average of Array Elements : %.2f",averageOfArrayElements);

    }
}
