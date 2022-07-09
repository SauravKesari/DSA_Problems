package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums={1,4,8,7,5};
        System.out.println(Arrays.toString(twoSum1(nums,22)));
    }
    //2nd Method using HashMap
    static int[] twoSum1(int[]nums,int target){
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(map.containsKey(target-nums[i])){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }

            map.put(nums[i],i);
        }
        return null;
    }
    static int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int sum=target-nums[i];
            for(int j=i+1;j< nums.length;j++){
                if(nums[j]==sum){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }

}
