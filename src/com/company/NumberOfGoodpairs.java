package com.company;

public class NumberOfGoodpairs {
    public static void main(String[] args) {
       int[] arr={1,1,1,1};
        System.out.println(goodPairs(arr));
    }
    static int goodPairs(int[] nums){
        int index=0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i]==nums[j])
                    index=index+1;
            }
        }
        return index;
    }
}
