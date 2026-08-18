package com.nexorithmm.dsa.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateElements {
    public static void main(String[] args) {

/*
        📌 Problem Statement

        Given an integer array, find all the elements that appear more than once.

        Each duplicate element should be printed only once.

        Example 1

        Input:

    [1, 2, 3, 2, 4, 1]

        Output:

        1 2
        Example 2

        Input:

    [4, 7, 2, 4, 9, 7, 7]

        Output:

        4 7

        Even though 7 appears three times, we print it only once.

        Example 3

        Input:

    [1, 2, 3, 4, 5]

        Output:

        No duplicate elements

 */

                int[] array = {1, 2, 3, 2, 2, 4, 1};

//                boolean isDuplicate = false;
//
//                for(int i=0;i<array.length;i++){
//                    boolean alreadySeen = false;
//
//                    for(int k=0;k<i;k++){
//                        if(array[k] == array[i]){
//                            alreadySeen = true;
//                        }
//                    }
//
//                    if(alreadySeen){
//                        continue;
//                    }
//
//                    for(int j=i+1;j<array.length;j++){
//                        if(array[i] == array[j]){
//                            isDuplicate = true;
//                            System.out.println(array[i]);
//                            break;
//                        }
//
//                    }
//                }
//
//
//
//                if(!isDuplicate){
//                    System.out.println("No duplicate element found");
//                }

//        HashSet<Integer> hashSet = new HashSet<>();
//        boolean isDuplicate = false;
//
//        for(int i=0;i<array.length;i++){
//            for(int j=i+1;j<array.length;j++){
//
//                if(array[i] == array[j]){
//                    hashSet.add(array[i]);
//                    isDuplicate = true;
//                }
//            }
//        }
//
//        if(!isDuplicate){
//            System.out.println("No duplicate element found");
//        }
//
//        System.out.println(hashSet);


        HashMap<Integer,Integer> hashMap =new HashMap<>();

        for(int i=0;i<array.length;i++){
            hashMap.put(array[i],hashMap.getOrDefault(array[i],0)+1);
        }

        for(int key : hashMap.keySet()){

            if(hashMap.get(key) > 1){
                System.out.println(key);
            }
        }

    }
}
