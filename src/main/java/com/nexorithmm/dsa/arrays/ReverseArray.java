package com.nexorithmm.dsa.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

/*

📌 Problem Statement

        Given an integer array, reverse the elements of the array and print the reversed array.

        Example
                Input
    [10, 20, 30, 40, 50]
        Output
     [50, 40, 30, 20, 10]

 */

        int[] array = {10, 20, 30, 40, 50};

//        for(int i= array.length-1;i>=0;i--){
//            System.out.println(array[i]);
//        }

        int i = 0;
        int j = array.length-1;

        while (i < j){
            int cuurent = array[i];
            array[i] = array[j];
            array[j] = cuurent;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(array));

    }
}
