package com.nexorithmm.dsa.arrays;

public class LargestElement {
    public static void main(String[] args) {

        /*

        📝 Problem Statement

        Given an integer array, find the largest element.

                Example
        Input:
    [5, 2, 9, 1, 7]

        Output:
        9

        🧪 Test Cases
            Input:
         [5, 2, 9, 1, 7]

            Output:
                9
            Input:
            [10]

            Output:
                10
               Input:
            [-5, -2, -8]

            Output:
                 -2
                Input:
            [7, 7, 7]

            Output:
                7

        📌 Constraints
            Array size ≥ 1
            Array may contain negative numbers
            Array may contain duplicate values

            📚 Time Complexity
                        O(n)

            We visit each element once.

                📚 Space Complexity
                         O(1)

We only use one extra variable (largestElement), regardless of the array size.

         */


        int[] array = {5, 2, 9, 1, 7};

        int largestElement = array[0];

        for(int i = 1;i < array.length; i++){

            if(array[i] > largestElement){
                largestElement = array[i];
            }

        }

        System.out.println("Largest Element : "+largestElement);

    }
}
