package com.company;

import java.util.Arrays;

public class Delete_Array {
    public static void main(String[] args) {
        int[]nums={4,8,14,15,12};
//        System.out.println(findElement(nums, nums.length, 12));
//        int l=deleteElement(nums, nums.length, 1);
//        for (int i = 0; i <l ; i++) {
//            System.out.print((nums[i])+"\t");
//        }

        System.out.println(binarySearch(nums,0, nums.length-1, 15));
    }
    static int findElement(int[]arr,int n,int key){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    static int deleteElement(int[]arr,int n,int key){
        int pos=findElement(arr,n,key);
        if(pos==-1){
            System.out.println("Element not Found\n");
            return n;
        }
        for (int i = pos; i <n-1 ; i++) {
            arr[i]=arr[i+1];
        }
        return n-1;

    }
    static int binarySearch(int[]arr,int start,int end,int key){
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
        }
        return binarySearch(arr,start,end,key);
    }
}
