package com.nexorithmm.dsa.arrays;

public class SmallestElement {
    public static void main(String[] args) {

/*

        Problem Statement

        Given an integer array, find the smallest element.

                Example
        Input:
    [10, 25, 8, 25, 15]

        Output:
        8

        🧪 Test Cases
Test 1
int[] array = {10, 25, 8, 25, 15};

Output:

8

✅ Correct

Test 2
int[] array = {-5, -10, 3, 7};

Output:

-10

✅ Correct

Test 3
int[] array = {5};

Output:

5

✅ Correct

Test 4
int[] array = {4, 4, 4, 4};

Output:

4

✅ Correct

 */

        int[] array = {10, 25, 8, 25, 15};

        int smallestElement = array[0];

        for(int i = 1;i < array.length;i++){

            if(array[i] < smallestElement){
                smallestElement = array[i];
            }

        }

        System.out.println("Smallest Element : "+smallestElement);

    }
}
