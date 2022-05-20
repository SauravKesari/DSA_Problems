package com.company;

import java.util.Arrays;

public class runningSum {
    public static void main(String[] args) {
      int[] nums={1,2,3,4};
      int[] res=Sum(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] Sum(int[] nums){
        int[] res=new int[nums.length];

        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <=i ; j++) {
                res[i]+=nums[j];
            }
        }
        return res;
    }
}
