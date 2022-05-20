package com.company;

import java.util.Arrays;

public class SmallerthanCurrent {
    public static void main(String[] args) {
       int[] arr={8,1,2,2,3};
       int[] res=smallerCurrent(arr);
        System.out.println(Arrays.toString(res));

    }
    static int[] smallerCurrent(int[] nums){
        int[] res=new int[nums.length];
        int max=0;

        for (int i = 0; i < nums.length ; i++) {
            max=nums[i];
            int count=0;
            for (int j = 0; j < nums.length ; j++) {
                if(max>nums[j])
                    count=count+1;


            }
            res[i]=count;
        }
        return res;
    }
}
