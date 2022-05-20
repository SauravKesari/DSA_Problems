package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      int[] nums={4,0,3,2,1};
      int[] res=arrayPermutation(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] arrayPermutation(int[]nums){
        int n= nums.length;
        int[]res=new int[n];
        for (int i = 0; i < nums.length ; i++) {
            res[i]=nums[nums[i]];
        }
        return res;
    }
}