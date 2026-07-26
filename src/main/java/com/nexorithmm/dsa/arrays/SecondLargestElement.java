package com.nexorithmm.dsa.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

      /*

        📄 Problem Statement

        Given an integer array, find the second largest distinct element.

                Example 1
        Input:
    [10, 25, 8, 25, 15]

        Output:
        15
        Example 2
        Input:
    [5, 2, 9, 1, 7]

        Output:
        7
        Example 3
        Input:
    [25, 25]

        Output:
        Second largest element does not exist

       */


        int[] array = {10, 25, 8, 25, 15};

        int largestNumber = array[0];
        int secondLargestNumber = Integer.MIN_VALUE;

        for(int i = 1; i < array.length; i++){

            if(array[i] > largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = array[i];
            } else if (array[i] > secondLargestNumber && array[i] != largestNumber) {
                secondLargestNumber = array[i];
            }

        }

        if(secondLargestNumber == Integer.MIN_VALUE){
            System.out.println("Second largest element does not exist");
        }else {
            System.out.println("Second Largest Element : "+secondLargestNumber);
        }

    }
}
