package com.nexorithmm.dsa.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        /*

        📌 Problem Statement

        Given a sorted integer array, remove the duplicates in-place so that each unique element appears only once.

        Return the number of unique elements in the array.

                The relative order of the unique elements must be maintained.

                Example
        Input:
    [1, 1, 2]

        Output:
        2

        Modified array:
    [1, 2, _]
        Another Example
        Input:
    [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]

        Output:
        5

        Modified array:
    [0, 1, 2, 3, 4, _]
🎯 Requirements
                Array is sorted.
                Modify the same array (in-place).
                Keep each unique element only once.
                Maintain the order of unique elements.
                Return the count of unique elements.
                Target: O(n) time, O(1) extra space.

        */

        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = 1;
        int temp = array[0];
        int j =1;

        //if array empty handle edge case
//        if(array.length == 0){
//            return 0;
//        }

     //instead of temp we use this but bit confuse
//        if (array[i] != array[j - 1]) {
//            array[j++] = array[i];
//        }

        for(int i=1;i< array.length;i++){
            if(array[i] != temp){
                array[j++] = array[i];
                temp = array[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
}
