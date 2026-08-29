package com.nexorithmm.dsa.arrays;

public class MoveZeroes {
    public static void main(String[] args) {

/*

        📌 Problem Statement

        Given an integer array nums, move all 0s to the end of the array while maintaining the relative order of the non-zero elements.

                You must modify the array in-place without creating another array.

        Example
        Input:
    [0, 1, 0, 3, 12]

        Output:
    [1, 3, 12, 0, 0]
        Another Example
        Input:
    [0, 0, 1]

        Output:
    [1, 0, 0]

 */

        int[] array = {0, 1, 0, 3, 12};

        //brute force

//        int[]  newArray = new int[array.length];
//        int j = 0;
//
//        for(int i=0;i<array.length;i++){
//            if(array[i] != 0){
//                newArray[j++] = array[i];
//            }
//        }
//
//        for(int x : newArray){
//            System.out.println(x);
//        }



//        Second approach better two phase

//        int j = 0;
//
        //phase-1
//        for(int i=0;i<array.length;i++){
//            if(array[i] != 0){
//                array[j++] = array[i];
//            }
//        }
//
        //phase-2
//        for(int i=j;i<array.length;i++){
//            array[i] =0;
//        }
//
//        for(int x : array){
//            System.out.println(x);
//        }

        //Third approch better two pointers + swap

        int j = 0;

//        0, 1, 0, 3, 12

        for(int i=0;i< array.length;i++){

            if(array[i] != 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }

        }

        for (int x : array){
            System.out.println(x);
        }



    }
}
