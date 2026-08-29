package com.nexorithmm.dsa.arrays;

public class MissingNumber {
    public static void main(String[] args) {

/*

        Problem Statement

        Given an array nums containing n distinct numbers in the range [0, n], return the only number missing from the array.

        Example
        Input:  [3, 0, 1]
        Output: 2
        Input:  [0, 1]
        Output: 2

🎯 Goal: O(n) time and O(1) extra space.

 */


        int[] array = {3, 0, 1};

//        int n = array.length;
//        int expectedSum = n * (n+1) / 2;
//        int actualSum = 0;
//        int result = 0;
//
//        for(int x : array){
//            actualSum += x;
//        }
//
//        result = expectedSum - actualSum;
//
//        System.out.println(result);

        //XOR


        int n = array.length;
        int result= n;

        for(int i=0;i<array.length;i++){
            result ^= i;
            result ^= array[i];
        }

        System.out.println(result);


    }
}
