package com.company;

import java.util.HashMap;

public class Unique_Element_Array {
    public static void main(String[] args) {
        int[]nums={7,2,5,4,2,5,4};
        System.out.println(elementAppearOnce(nums));
        System.out.println(singleElement(nums));
    }
    static int elementAppearOnce(int[]arr){
        int res=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            res=res^arr[i];

        }
        return res;
    }
    //2nd method multiply the sum of all unique numbers by 2 and then substract it from sum of all array element
    static int singleElement(int[]arr){
        long sum1=0,sum2=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length ; i++) {
            if(!map.containsKey(arr[i])){
                sum1+=arr[i];
                map.put(arr[i],1);
            }
            sum2+=arr[i];
        }
        return (int) (2*sum1-sum2);
    }
}
