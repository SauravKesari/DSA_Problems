package com.company;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
       int[] nums={1,2,3};
       int[] res=concat(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] concat(int[] nums){
        //int n= nums.length;
        int[] res=new int[2* nums.length];

        for (int i = 0; i < 2* nums.length ; i++) {
            res[i]=nums[i% nums.length];

        }
        return res;
    }
}
