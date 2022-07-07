package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class HungryCustomer {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(bin_search(arr,0, arr.length-1, 8));
    }
    static int bin_search(int[]arr,int start,int end,int k){
        if(end>=start)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==k)
                return mid;
            if(arr[mid]>k)
                return bin_search(arr,start,mid-1,k);

            return bin_search(arr,mid+1,end,k);
        }
        return -1;
    }
    int sort(int[]nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=(j+1))
                return (j+1);
        }

        return nums.length;
    }
    void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
