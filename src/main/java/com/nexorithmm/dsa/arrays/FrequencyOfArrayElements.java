package com.nexorithmm.dsa.arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {

/*

        📌 Problem Statement

        Given an integer array, find the frequency of each element — that is, how many times each element appears in the array.

        Example
                Input
    [1, 2, 2, 3, 1, 4, 2]
        Output
        1 → 2
        2 → 3
        3 → 1
        4 → 1

 */


        int[] array = {1,2,2,3,1,4,2};

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<array.length;i++){
            hashMap.put(array[i],hashMap.getOrDefault(array[i], 0)+1);
        }

//        Iterator<Map.Entry<Integer,Integer>> iterator = hashMap.entrySet().iterator();
//
//        while(iterator.hasNext()){
//            Map.Entry<Integer,Integer> entry = iterator.next();
//
//            int key = entry.getKey();
//            int value = entry.getValue();
//
//            System.out.println(key+" -> "+value);


        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }

    }
}
