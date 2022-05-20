package com.company;

import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int[] res=shuffle(nums,3);
        System.out.println(Arrays.toString(res));
       // System.out.println(2%3);
    }
    static int[] shuffle(int[] nums,int n){
        int[] res=new int[nums.length];
        int index=0;
        for (int i = 0; i < nums.length/2; i++) {
            res[index++]=nums[i];
            res[index++]=nums[n++];
        }
        return res;
    }

}
