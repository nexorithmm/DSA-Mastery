package com.nexorithmm.dsa.arrays;

import java.util.Arrays;

public class CountEvenAndOddNumbers {
    public static void main(String[] args) {

      /*

        📖 Problem Statement

        Given an integer array, count how many elements are even and how many are odd.

        📝 Example
                Input
        Array = {10, 25, 8, 17, 30, 41, 56}
        Output
        Even Count : 4
        Odd Count  : 3

       */

        int[] array = {10, 25, 8, 17, 30, 41, 56};
        int evenCount = 0;
        int oddCount = 0;

        for(int element : array){

            if(element%2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }

        }

        System.out.println("==========================================");
        System.out.println("                Count Even & Odd Numbers");
        System.out.println("==========================================");

        System.out.println();
        System.out.println("Array : "+ Arrays.toString(array));
        System.out.println();

        System.out.println("Even Count : "+evenCount);
        System.out.println("Odd Count  : "+oddCount);

    }
}
