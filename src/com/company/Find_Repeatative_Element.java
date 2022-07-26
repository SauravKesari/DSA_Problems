package com.company;

//link
//https://www.geeksforgeeks.org/find-repetitive-element-1-n-1/?ref=lbp

import java.util.HashMap;
import java.util.HashSet;

//An array contains value from 1 to n-1 only
//We are given an array arr[] of size n. Numbers are from 1 to (n-1) in random order.
// The array has only one repetitive element. We need to find the repetitive element.
public class Find_Repeatative_Element {
    public static void main(String[] args) {
        int[]nums={5,2,6,3,15,1};
        System.out.println(repeatedElement(nums));

    }
    static int repeatedElement(int[]arr){
        HashSet<Integer> s=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])){
                return arr[i];
            }
            else{
                s.add(arr[i]);
            }
        }
        return -1;
    }

}
