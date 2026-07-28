package com.nexorithmm.dsa.arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {

        /*
        
        📝 Problem Statement

        Given an integer array, find the second smallest distinct element.

                Example 1
        Input:
    [10, 25, 8, 25, 15]

        Output:
        10
        Example 2
        Input:
    [5, 2, 9, 1, 7]

        Output:
        2
        Example 3
        Input:
    [8, 8]

        Output:
        Second smallest element does not exist.
        
         */
        
        
        int[] array = {10, 25, 8, 25, 15};
        
        int smallestElement = array[0];
        int secondSmallestElement = Integer.MAX_VALUE;
        
        for(int i = 1; i < array.length; i++){
            
            if(array[i] < smallestElement){
                secondSmallestElement = smallestElement;
                smallestElement = array[i];
            } else if (array[i] < secondSmallestElement && array[i] != smallestElement) {
                secondSmallestElement = array[i];
            }
            
        }
        
        if(secondSmallestElement == Integer.MAX_VALUE){
            System.out.println("Second smallest element does not exist.");
        }else{
            System.out.println("Second Smallest Element : "+secondSmallestElement);
        }
        
    }
}
