package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(binarySearch(arr,arr.length,5));
    }
    static int binarySearch(int[] arr,int n,int k){
        return binarySearch1(arr,0,n-1,k);
    }
    static int binarySearch1(int[]arr,int left,int right,int k){
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == k) return mid;
        if (arr[mid] > k)
            return binarySearch1(arr, left, mid - 1, k);
        else
            return binarySearch1(arr, mid + 1, right, k);
    }
}
